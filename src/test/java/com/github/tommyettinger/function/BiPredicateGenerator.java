package com.github.tommyettinger.function;

import com.squareup.javapoet.*;

import javax.lang.model.element.Modifier;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

import static com.github.tommyettinger.function.GeneratorCommon.*;
import static com.squareup.javapoet.TypeName.BOOLEAN;
import static com.squareup.javapoet.TypeName.OBJECT;

public class BiPredicateGenerator {

    public static final LinkedHashMap<TypeName, LinkedHashMap<TypeName, Class<?>>> EXISTING_FUNCTIONS = map(
            OBJECT, map(OBJECT, BiPredicate.class)
    );

    public static final LinkedHashMap<Class<?>, String> NAME_CHANGES = map(
            BiPredicate.class, "ObjObjPredicate"
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
//                if(rename != null){
//                    TypeSpec.Builder tb = TypeSpec.interfaceBuilder(rename).addModifiers(mods).addTypeVariables(generics);
//                    if(!generics.isEmpty())
//                        tb.addSuperinterface(ParameterizedTypeName.get(replacing, generics.toArray(new TypeName[0])));
//                    else
//                        tb.addSuperinterface(existing);
//                    tb.addAnnotation(FunctionalInterface.class);
//                    tb.addJavadoc(
//                            "Represents an operation that accepts\n" +
//                                    "two input arguments and returns no result.\n" +
//                                    "<br>\n" +
//                                    "This is a functional interface\n" +
//                                    "whose functional method is {@link #accept($1T, $2T)}.", arg0, arg1
//                    );
//                    JavaFile.builder(packageName, tb.build()).skipJavaLangImports(true).build()
//                            .writeTo(outPath);
//                }
//                else if(outerEx != null && existing != null){
//                    // here we already have a well-named functional interface in the JDK; skip this.
//                    System.out.println(arg0 + " returning " + arg1 + " already has a good interface." );
//                }
                if(rename != null){
                    TypeSpec.Builder tb = TypeSpec.interfaceBuilder(rename).addModifiers(mods).addTypeVariables(generics);
                    tb.addAnnotation(FunctionalInterface.class);
                    tb.addJavadoc(
                            "Represents an operation that accepts\n" +
                                    "two input arguments and returns a {@code boolean} result.\n" +
                                    "<br>\n" +
                                    "This is identical to {@code $3L} in Java 8, and is present here so environments\n" +
                                    "that support lambdas but not Java 8 APIs (such as RoboVM) can use it.\n" +
                                    "<br>\n" +
                                    "This is a functional interface\n" +
                                    "whose functional method is {@link #test($1T, $2T)}.", arg0, arg1, replacing.simpleName()
                    );
                    MethodSpec.Builder mb = MethodSpec.methodBuilder("test")
                            .addParameter(fst, "first", emptyMods).addParameter(snd, "second", emptyMods).addModifiers(interfaceMods).returns(BOOLEAN);
                    mb.addJavadoc(
                            "Evaluates this predicate on the given arguments.\n" +
                                    "\n" +
                                    "@param first the first input argument\n" +
                                    "@param second the second input argument\n" +
                                    "@return {@code true} if the input arguments match the predicate,\n" +
                                    "otherwise {@code false}\n"
                    );
                    tb.addMethod(mb.build());
                    JavaFile.builder(packageName, tb.build()).skipJavaLangImports(true).build()
                            .writeTo(outPath);
                }
                else if(outerEx != null && existing != null){
                    System.out.println("Predicate taking " + arg0 + " and " + arg1 + " should not be in this block!");
                }
                else {
                    TypeSpec.Builder tb = TypeSpec.interfaceBuilder(TITLE_NAMES.get(arg0) + TITLE_NAMES.get(arg1) + "Predicate")
                            .addModifiers(mods).addTypeVariables(generics);
                    tb.addAnnotation(FunctionalInterface.class);
                    tb.addJavadoc(
                            "Represents an operation that accepts\n" +
                                    "two input arguments and returns a {@code boolean} result.\n" +
                                    "<br>\n" +
                                    "This is a functional interface\n" +
                                    "whose functional method is {@link #test($1T, $2T)}.", arg0, arg1
                    );
                    MethodSpec.Builder mb = MethodSpec.methodBuilder("test")
                            .addParameter(fst, "first", emptyMods).addParameter(snd, "second", emptyMods).addModifiers(interfaceMods).returns(BOOLEAN);
                    mb.addJavadoc(
                            "Evaluates this predicate on the given arguments.\n" +
                                    "\n" +
                                    "@param first the first input argument\n" +
                                    "@param second the second input argument\n" +
                                    "@return {@code true} if the input arguments match the predicate,\n" +
                                    "otherwise {@code false}\n"
                    );
                    tb.addMethod(mb.build());
                    JavaFile.builder(packageName, tb.build()).skipJavaLangImports(true).build()
                            .writeTo(outPath);
                }
            }
        }
    }
}
