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

import static com.github.tommyettinger.function.GeneratorCommon.*;
import static com.squareup.javapoet.TypeName.*;

public class ConsumerGenerator {

    public static final LinkedHashMap<TypeName, Class<?>> EXISTING_FUNCTIONS =
            new LinkedHashMap<>();
//            map(
//            DOUBLE, DoubleConsumer.class,
//            INT, IntConsumer.class,
//            LONG, LongConsumer.class,
//            OBJECT, Consumer.class
//    );

    private static final Modifier[] mods = {Modifier.PUBLIC};
    private static final Modifier[] emptyMods = {};
    private static final Modifier[] interfaceMods = {Modifier.ABSTRACT, Modifier.PUBLIC};

    public static void main(String[] args) throws IOException {
        String packageName = "com.github.tommyettinger.function";
        for (TypeName arg0 : TYPES) {
            Class<?> existing = EXISTING_FUNCTIONS.get(arg0);
            if (existing != null) {
                // here we already have a well-named functional interface in the JDK; skip this.
                System.out.println("consumer taking " + arg0 + " already has a good interface.");
                continue;
            }
            Path outPath = Paths.get("src-gen/main/java");

            TypeSpec.Builder tb = TypeSpec.interfaceBuilder(TITLE_NAMES.get(arg0) + "Consumer")
                    .addModifiers(mods);
            tb.addAnnotation(FunctionalInterface.class);
            tb.addJavadoc(
                    "Represents an operation that accepts a single {@code $1T}-valued argument and\n" +
                            "returns no result.\n" +
                            "<br>\n" +
                            "This is a functional interface whose functional method is {@link #accept($1T)}.",
                    arg0
            );
            MethodSpec.Builder mb = MethodSpec.methodBuilder("accept")
                    .addParameter(arg0, "value", emptyMods).addModifiers(interfaceMods).returns(VOID);
            mb.addJavadoc("Performs this operation on the given argument.\n" +
                    "\n" +
                    "@param value the input argument\n");
            tb.addMethod(mb.build());
            JavaFile.builder(packageName, tb.build()).skipJavaLangImports(true).build()
                    .writeTo(outPath);

        }
    }
}
