package com.github.tommyettinger.fun;

import java.util.function.ToLongBiFunction;

/**
 * Represents an operation on a {@code T}-valued operand and a {@code U}-valued
 * operand that produces a {@code long}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsLong(Object, Object)}.
 */
@FunctionalInterface
public interface ObjObjToLongBiFunction<T, U> extends ToLongBiFunction<T, U> {
}
