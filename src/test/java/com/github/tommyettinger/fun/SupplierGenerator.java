package com.github.tommyettinger.fun;

import com.squareup.javapoet.*;

import javax.lang.model.element.Modifier;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.function.*;

import static com.github.tommyettinger.fun.GeneratorCommon.*;
import static com.squareup.javapoet.TypeName.*;

public class SupplierGenerator {

    public static final LinkedHashMap<TypeName, Class<?>> EXISTING_FUNCTIONS = map(
            BOOLEAN, BooleanSupplier.class,
            DOUBLE, DoubleSupplier.class,
            INT, IntSupplier.class,
            LONG, LongSupplier.class,
            OBJECT, Supplier.class
    );

    private static final Modifier[] mods = {Modifier.PUBLIC};
    private static final Modifier[] emptyMods = {};
    private static final Modifier[] interfaceMods = {Modifier.ABSTRACT, Modifier.PUBLIC};

    public static void main(String[] args) throws IOException {
        String packageName = "com.github.tommyettinger.fun";
        for (TypeName retType : TYPES) {
            Class<?> existing = EXISTING_FUNCTIONS.get(retType);
            if (existing != null) {
                // here we already have a well-named functional interface in the JDK; skip this.
                System.out.println("supplier returning " + retType + " already has a good interface.");
                continue;
            }
            TypeName ret = retType;

            Path outPath = Paths.get("src-gen/main/java");

            TypeSpec.Builder tb = TypeSpec.interfaceBuilder(TITLE_NAMES.get(retType) + "Supplier")
                    .addModifiers(mods);
            tb.addAnnotation(FunctionalInterface.class);
            tb.addJavadoc(
                    "Represents a supplier of {@code $1T}-valued results.\n" +
                            "<br>\n" +
                            "This is a functional interface whose functional method is {@link #$2L()}.",
                    ret, SUPPLIER_RETURN_NAMES.get(retType)
            );
            MethodSpec.Builder mb = MethodSpec.methodBuilder(SUPPLIER_RETURN_NAMES.get(retType))
                    .addModifiers(interfaceMods).returns(ret);
            mb.addJavadoc("Gets a result.\n" +
                    "\n" +
                    "@return a result\n");
            tb.addMethod(mb.build());
            JavaFile.builder(packageName, tb.build()).skipJavaLangImports(true).build()
                    .writeTo(outPath);

        }
    }
}
