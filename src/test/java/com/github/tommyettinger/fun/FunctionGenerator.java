package com.github.tommyettinger.fun;

import com.squareup.javapoet.*;

import javax.lang.model.element.Modifier;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.function.*;

import static com.github.tommyettinger.fun.GeneratorCommon.*;
import static com.squareup.javapoet.TypeName.*;

public class FunctionGenerator {

    public static final LinkedHashMap<TypeName, LinkedHashMap<TypeName, Class<?>>> EXISTING_FUNCTIONS = map(
            DOUBLE, map(
                    DOUBLE, DoubleUnaryOperator.class,
                    INT, DoubleToIntFunction.class,
                    LONG, DoubleToLongFunction.class,
                    OBJECT, DoubleFunction.class),
            INT, map(
                    DOUBLE, IntToDoubleFunction.class,
                    INT, IntUnaryOperator.class,
                    LONG, IntToLongFunction.class,
                    OBJECT, IntFunction.class),
            LONG, map(
                    DOUBLE, LongToDoubleFunction.class,
                    INT, LongToIntFunction.class,
                    LONG, LongUnaryOperator.class,
                    OBJECT, LongFunction.class),
            OBJECT, map(
                    DOUBLE, ToDoubleFunction.class,
                    INT, ToIntFunction.class,
                    LONG, ToLongFunction.class,
                    OBJECT, UnaryOperator.class)
    );

    public static final LinkedHashMap<Class<?>, String> NAME_CHANGES = map(
            DoubleUnaryOperator.class, "DoubleToDoubleFunction",
            IntUnaryOperator.class, "IntToIntFunction",
            LongUnaryOperator.class, "LongToLongFunction",
            ToDoubleFunction.class, "ObjToDoubleFunction",
            ToIntFunction.class, "ObjToIntFunction",
            ToLongFunction.class, "ObjToLongFunction",
            UnaryOperator.class, "ObjToSameFunction"
    );
    private static final Modifier[] mods = {Modifier.PUBLIC};
    private static final Modifier[] emptyMods = {};
    private static final Modifier[] interfaceMods = {Modifier.ABSTRACT, Modifier.PUBLIC};

    public static void main(String[] args) throws IOException {
        String packageName = "com.github.tommyettinger.fun";
        for(TypeName arg0 : TYPES){
            LinkedHashMap<TypeName, Class<?>> outerEx = EXISTING_FUNCTIONS.get(arg0);
            for(TypeName retType : TYPES) {
                TypeName ret, fst = arg0;
                ArrayDeque<TypeVariableName> generics = new ArrayDeque<>(2);
                if(!arg0.isPrimitive()) {
                    generics.addLast(TypeVariableName.get("T"));
                    fst = TypeVariableName.get("T");
                }
                else if(!retType.isPrimitive())
                    generics.addLast(TypeVariableName.get("R"));
                if(!retType.isPrimitive())
                    ret = generics.getLast();
                else
                    ret = retType;
                Class<?> existing;
                ClassName replacing;
                if(outerEx != null) {
                    existing = outerEx.get(retType);
                }
                else {
                    existing = null;
                }
                String rename;
                if(existing != null) {
                    rename = NAME_CHANGES.get(existing);
                    replacing = ClassName.get(existing);
                }
                else {
                    rename = null;
                    replacing = null;
                }

                Path outPath = Paths.get("src-gen/main/java");
                if(rename != null){
                    TypeSpec.Builder tb = TypeSpec.interfaceBuilder(rename).addModifiers(mods).addTypeVariables(generics);
                    if(!generics.isEmpty())
                        tb.addSuperinterface(ParameterizedTypeName.get(replacing, generics.toArray(new TypeName[0])));
                    else
                        tb.addSuperinterface(existing);
                    tb.addAnnotation(FunctionalInterface.class);
                    tb.addJavadoc(
                            "Represents an operation on a single {@code $1T}-valued operand that produces\n" +
                            "a {@code $2T}-valued result.\n" +
                            "<br>\n" +
                            "This is a functional interface whose functional method is {@link #$3L($4T)}.",
                            fst, ret, FUNCTION_RETURN_NAMES.get(retType), arg0
                    );
                    JavaFile.builder(packageName, tb.build()).skipJavaLangImports(true).build()
                            .writeTo(outPath);
                }
                else if(outerEx != null && existing != null){
                    // here we already have a well-named functional interface in the JDK; skip this.
                    System.out.println(arg0 + " returning " + retType + " already has a good interface." );
                }
                else {
                    TypeSpec.Builder tb = TypeSpec.interfaceBuilder(TITLE_NAMES.get(arg0) + "To" + TITLE_NAMES.get(retType) + "Function")
                            .addModifiers(mods).addTypeVariables(generics);
                    tb.addAnnotation(FunctionalInterface.class);
                    tb.addJavadoc(
                            "Represents an operation on a single {@code $1T}-valued operand that produces\n" +
                                    "a {@code $2T}-valued result.\n" +
                                    "<br>\n" +
                                    "This is a functional interface whose functional method is {@link #$3L($4T)}.",
                            fst, ret, FUNCTION_RETURN_NAMES.get(retType), arg0
                    );
                    MethodSpec.Builder mb = MethodSpec.methodBuilder(FUNCTION_RETURN_NAMES.get(retType))
                            .addParameter(fst, "value", emptyMods).addModifiers(interfaceMods).returns(ret);
                    mb.addJavadoc("Applies this fun to the given argument.\n" +
                            "\n" +
                            "@param value the fun argument\n" +
                            "@return the fun result\n");
                    tb.addMethod(mb.build());
                    JavaFile.builder(packageName, tb.build()).skipJavaLangImports(true).build()
                            .writeTo(outPath);

                }
            }
        }
    }
}
