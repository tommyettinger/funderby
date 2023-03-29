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

public class BiConsumerGenerator {

    public static final LinkedHashMap<TypeName, LinkedHashMap<TypeName, Class<?>>> EXISTING_FUNCTIONS = map(
            OBJECT, map(OBJECT, BiConsumer.class)
    );

    public static final LinkedHashMap<Class<?>, String> NAME_CHANGES = map(
            BiConsumer.class, "ObjObjBiConsumer"
    );
    private static final Modifier[] mods = {Modifier.PUBLIC};
    private static final Modifier[] emptyMods = {};
    private static final Modifier[] interfaceMods = {Modifier.ABSTRACT, Modifier.PUBLIC};

    public static void main(String[] args) throws IOException {
        String packageName = "com.github.tommyettinger.function";
        for(TypeName arg0 : TYPES){
            LinkedHashMap<TypeName, Class<?>> outerEx = EXISTING_FUNCTIONS.get(arg0);
            for(TypeName arg1 : TYPES) {
                TypeName fst = arg0, snd = arg1;
                ArrayDeque<TypeVariableName> generics = new ArrayDeque<>(2);
                if(!arg0.isPrimitive()) {
                    generics.addLast(TypeVariableName.get("T"));
                    fst = generics.getLast();
                    if(!arg1.isPrimitive()) {
                        generics.addLast(TypeVariableName.get("U"));
                        snd = generics.getLast();
                    }
                }
                else if(!arg1.isPrimitive())
                {
                    generics.addLast(TypeVariableName.get("T"));
                    snd = generics.getLast();
                }
                Class<?> existing;
                ClassName replacing;
                if(outerEx != null) {
                    existing = outerEx.get(arg1);
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
                    // only happens for ObjObjBiConsumer, which we have special cases for
                }
                else {
                    TypeSpec.Builder tb = TypeSpec.interfaceBuilder(TITLE_NAMES.get(arg0) + TITLE_NAMES.get(arg1) + "BiConsumer")
                            .addModifiers(mods).addTypeVariables(generics);
                    tb.addAnnotation(FunctionalInterface.class);
                    tb.addJavadoc(
                            "Represents an operation that accepts\n" +
                                    "two input arguments and returns no result.\n" +
                                    "<br>\n" +
                                    "This is a functional interface\n" +
                                    "whose functional method is {@link #accept($1T, $2T)}.", arg0, arg1
                    );
                    MethodSpec.Builder mb = MethodSpec.methodBuilder("accept")
                            .addParameter(fst, "first", emptyMods).addParameter(snd, "second", emptyMods).addModifiers(interfaceMods).returns(VOID);
                    mb.addJavadoc(
                            "Performs this operation on the given arguments.\n" +
                                    "\n" +
                                    "@param first the first input argument\n" +
                                    "@param second the second input argument"
                    );
                    tb.addMethod(mb.build());
                    JavaFile.builder(packageName, tb.build()).skipJavaLangImports(true).build()
                            .writeTo(outPath);

                }
            }
        }
    }
}
