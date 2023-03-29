package com.github.tommyettinger.function;

import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

import javax.lang.model.element.Modifier;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.function.*;

import static com.github.tommyettinger.function.GeneratorCommon.TITLE_NAMES;
import static com.github.tommyettinger.function.GeneratorCommon.TYPES;
import static com.squareup.javapoet.TypeName.*;

public class PredicateGenerator {

    public static final LinkedHashMap<TypeName, Class<?>> EXISTING_FUNCTIONS =
            GeneratorCommon.map(
            DOUBLE, DoublePredicate.class,
            INT, IntPredicate.class,
            LONG, LongPredicate.class,
            OBJECT, Predicate.class
    );

    private static final Modifier[] mods = {Modifier.PUBLIC};
    private static final Modifier[] emptyMods = {};
    private static final Modifier[] interfaceMods = {Modifier.ABSTRACT, Modifier.PUBLIC};

    public static void main(String[] args) throws IOException {
        String packageName = "com.github.tommyettinger.function";
        for (TypeName arg0 : TYPES) {
            Class<?> existing = EXISTING_FUNCTIONS.get(arg0);
            Path outPath = Paths.get("src-gen/main/java");

            TypeSpec.Builder tb = TypeSpec.interfaceBuilder(TITLE_NAMES.get(arg0) + "Predicate")
                    .addModifiers(mods);
            tb.addAnnotation(FunctionalInterface.class);
            if(existing != null){
                tb.addJavadoc(
                        "Represents an operation that accepts a single {@code $1T}-valued argument and\n" +
                                "returns a {@code boolean} result.\n" +
                                "<br>\n" +
                                "This is identical to {@code $2L} in Java 8, and is present here so environments\n" +
                                "that support lambdas but not Java 8 APIs (such as RoboVM) can use it.\n" +
                                "<br>\n" +
                                "This is a functional interface whose functional method is {@link #test($1T)}.",
                        arg0, existing.getSimpleName()
                );
            }
            else {
                tb.addJavadoc(
                        "Represents an operation that accepts a single {@code $1T}-valued argument and\n" +
                                "returns a {@code boolean} result.\n" +
                                "<br>\n" +
                                "This is a functional interface whose functional method is {@link #test($1T)}.",
                        arg0
                );
            }
            MethodSpec.Builder mb = MethodSpec.methodBuilder("test")
                    .addParameter(arg0, "value", emptyMods).addModifiers(interfaceMods).returns(BOOLEAN);
            mb.addJavadoc("Evaluates this predicate on the given argument.\n" +
                    "\n" +
                    "@param value the input argument\n" +
                    "@return {@code true} if the input argument matches the predicate,\n" +
                    "otherwise {@code false}\n");
            tb.addMethod(mb.build());
            JavaFile.builder(packageName, tb.build()).skipJavaLangImports(true).build()
                    .writeTo(outPath);

        }
    }
}
