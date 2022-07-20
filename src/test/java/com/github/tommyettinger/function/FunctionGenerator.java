package com.github.tommyettinger.function;

import com.squareup.javapoet.*;

import javax.lang.model.element.Modifier;
import javax.lang.model.type.TypeMirror;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.function.*;

import static com.github.tommyettinger.function.GeneratorCommon.TYPES;
import static com.github.tommyettinger.function.GeneratorCommon.map;
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
            UnaryOperator.class, "ObjectToSameFunction"
    );
    private static final Modifier[] mods = {Modifier.PUBLIC};

    public static void main(String[] args) throws IOException {
        String packageName = "com.github.tommyettinger.function";
        for(TypeName arg0 : TYPES){
            LinkedHashMap<TypeName, Class<?>> outerEx = EXISTING_FUNCTIONS.get(arg0);
            for(TypeName ret : TYPES) {
                ArrayDeque<TypeVariableName> generics = new ArrayDeque<>(2);
                if(!arg0.isPrimitive())
                    generics.addLast(TypeVariableName.get("T"));
                if(!ret.isPrimitive())
                    generics.addLast(TypeVariableName.get("R"));
                Class<?> existing;
                if(outerEx != null) existing = outerEx.get(ret);
                else existing = null;
                String rename;
                if(existing != null) {
                    rename = NAME_CHANGES.get(existing);
                }
                else rename = null;

                if(rename != null){
                    TypeSpec.Builder tb = TypeSpec.interfaceBuilder(rename).addModifiers(mods).addTypeVariables(generics)
                            .addSuperinterface(existing, true).addAnnotation(FunctionalInterface.class);
                    JavaFile.builder(packageName, tb.build()).skipJavaLangImports(true).build()
                            .writeTo(Paths.get("src-gen/main/java"));

                }
            }
        }
    }
}
