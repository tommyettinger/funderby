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
 * We're only generating BiFunctions that take the same type for the second argument and the return type. Having all
 * combinations of, for instance, ByteShortToFloatBiFunction... would be bad.
 */
public class BiFunction2Generator {

    public static final LinkedHashMap<TypeName, LinkedHashMap<TypeName, Class<?>>> EXISTING_FUNCTIONS = new LinkedHashMap<>();
    public static final LinkedHashMap<Class<?>, String> NAME_CHANGES = new LinkedHashMap<>();
    private static final Modifier[] mods = {Modifier.PUBLIC};
    private static final Modifier[] emptyMods = {};
    private static final Modifier[] interfaceMods = {Modifier.ABSTRACT, Modifier.PUBLIC};

    public static void main(String[] args) throws IOException {
        String packageName = "com.github.tommyettinger.function";
        for(TypeName arg0 : TYPES){
            for(TypeName retType : TYPES) {

                if (arg0.equals(retType))
                    continue;
                if(retType.equals(BOOLEAN))
                    continue; // these are predicates

                TypeName ret, fst = arg0, snd = retType;
                ArrayDeque<TypeVariableName> generics = new ArrayDeque<>(2);
                if (!arg0.isPrimitive()) {
                    generics.addLast(TypeVariableName.get("T"));
                    fst = TypeVariableName.get("T");
                }
                if (!retType.isPrimitive()) {
                    generics.addLast(TypeVariableName.get("T"));
                    snd = generics.getLast();
                    generics.addLast(TypeVariableName.get("R"));
                    ret = generics.getLast();
                } else
                    ret = retType;
                Path outPath = Paths.get("src-gen/main/java");

                TypeSpec.Builder tb = TypeSpec.interfaceBuilder(TITLE_NAMES.get(arg0) + TITLE_NAMES.get(retType) + "To" + TITLE_NAMES.get(retType) + "BiFunction")
                        .addModifiers(mods).addTypeVariables(generics);
                tb.addAnnotation(FunctionalInterface.class);
                tb.addJavadoc(
                        "Represents an operation on a {@code $1T}-valued operand and a {@code $2T}-valued\n" +
                                "operand that produces a {@code $3T}-valued result.\n" +
                                "<br>\n" +
                                "This is a functional interface whose functional method is {@link #$4L($5T, $6T)}.",
                        fst, snd, ret, FUNCTION_RETURN_NAMES.get(retType), arg0, retType
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
