package com.github.tommyettinger.function;

import java.util.function.BiFunction;

/**
 * Represents an operation on a {@code T}-valued operand and a {@code U}-valued
 * operand that produces a {@code R}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #apply(Object, Object)}.
 */
@FunctionalInterface
public interface ObjObjToObjFunction<T, U, R> extends BiFunction<T, U, R> {
}
