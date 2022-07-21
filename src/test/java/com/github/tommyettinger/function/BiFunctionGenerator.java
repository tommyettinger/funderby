package com.github.tommyettinger.function;

import com.squareup.javapoet.*;

import javax.lang.model.element.Modifier;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.function.*;

import static com.github.tommyettinger.function.GeneratorCommon.*;
import static com.squareup.javapoet.TypeName.*;

/**
 * We're only generating BiFunctions that take the same type for both arguments. Having all combinations of, for
 * instance, ByteShortToFloatBiFunction... would be bad.
 */
public class BiFunctionGenerator {

    public static final LinkedHashMap<TypeName, LinkedHashMap<TypeName, Class<?>>> EXISTING_FUNCTIONS = map(
            DOUBLE, map(
                    DOUBLE, DoubleBinaryOperator.class),
            INT, map(
                    INT, IntBinaryOperator.class),
            LONG, map(
                    LONG, LongBinaryOperator.class),
            OBJECT, map(
                    DOUBLE, ToDoubleBiFunction.class,
                    INT, ToIntBiFunction.class,
                    LONG, ToLongBiFunction.class,
                    OBJECT, BiFunction.class)
    );

    public static final LinkedHashMap<Class<?>, String> NAME_CHANGES = map(
            DoubleBinaryOperator.class, "DoubleDoubleToDoubleBiFunction",
            IntBinaryOperator.class, "IntIntToIntBiFunction",
            LongBinaryOperator.class, "LongLongToLongBiFunction",
            ToDoubleBiFunction.class, "ObjObjToDoubleBiFunction",
            ToIntBiFunction.class, "ObjObjToIntBiFunction",
            ToLongBiFunction.class, "ObjObjToLongBiFunction",
            BiFunction.class, "ObjObjToObjBiFunction"
    );
    private static final Modifier[] mods = {Modifier.PUBLIC};
    private static final Modifier[] emptyMods = {};
    private static final Modifier[] interfaceMods = {Modifier.ABSTRACT, Modifier.PUBLIC};

    public static void main(String[] args) throws IOException {
        String packageName = "com.github.tommyettinger.function";
        for(TypeName arg0 : TYPES){
            LinkedHashMap<TypeName, Class<?>> outerEx = EXISTING_FUNCTIONS.get(arg0);
            for(TypeName retType : TYPES) {
                if(retType.equals(BOOLEAN))
                    continue; // these are predicates
                TypeName ret, fst = arg0, snd = arg0;
                ArrayDeque<TypeVariableName> generics = new ArrayDeque<>(2);
                if(!arg0.isPrimitive()) {
                    generics.addLast(TypeVariableName.get("T"));
                    generics.addLast(TypeVariableName.get("U"));
                    fst = TypeVariableName.get("T");
                    snd = TypeVariableName.get("U");
                }
                if(!retType.isPrimitive()) {
                    generics.addLast(TypeVariableName.get("R"));
                    ret = generics.getLast();
                }
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
                            "Represents an operation on a {@code $1T}-valued operand and a {@code $2T}-valued\n" +
                            "operand that produces a {@code $3T}-valued result.\n" +
                            "<br>\n" +
                            "This is a functional interface whose functional method is {@link #$4L($5T, $5T)}.",
                            fst, snd, ret, FUNCTION_RETURN_NAMES.get(retType), arg0
                    );
                    JavaFile.builder(packageName, tb.build()).skipJavaLangImports(true).build()
                            .writeTo(outPath);
                }
                else if(outerEx != null && existing != null){
                    // here we already have a well-named functional interface in the JDK; skip this.
                    System.out.println(arg0 + " " + arg0 + " returning " + retType + " already has a good interface." );
                }
                else {
                    TypeSpec.Builder tb = TypeSpec.interfaceBuilder(TITLE_NAMES.get(arg0) + TITLE_NAMES.get(arg0) + "To" + TITLE_NAMES.get(retType) + "BiFunction")
                            .addModifiers(mods).addTypeVariables(generics);
                    tb.addAnnotation(FunctionalInterface.class);
                    tb.addJavadoc(
                            "Represents an operation on a {@code $1T}-valued operand and a {@code $2T}-valued\n" +
                                    "operand that produces a {@code $3T}-valued result.\n" +
                                    "<br>\n" +
                                    "This is a functional interface whose functional method is {@link #$4L($5T, $5T)}.",
                            fst, snd, ret, FUNCTION_RETURN_NAMES.get(retType), arg0
                    );
                    MethodSpec.Builder mb = MethodSpec.methodBuilder(FUNCTION_RETURN_NAMES.get(retType))
                            .addParameter(fst, "first", emptyMods).addParameter(snd, "second", emptyMods).addModifiers(interfaceMods).returns(ret);
                    mb.addJavadoc("Applies this function to the given arguments.\n" +
                            "\n" +
                            "@param first the first function argument\n" +
                            "@param second the second function argument\n" +
                            "@return the function result\n");
                    tb.addMethod(mb.build());
                    JavaFile.builder(packageName, tb.build()).skipJavaLangImports(true).build()
                            .writeTo(outPath);

                }
            }
        }
    }
}
