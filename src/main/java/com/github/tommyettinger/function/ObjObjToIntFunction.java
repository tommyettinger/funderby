package com.github.tommyettinger.function;

import java.util.function.ToIntBiFunction;

/**
 * Represents an operation on a {@code T}-valued operand and a {@code U}-valued
 * operand that produces a {@code int}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsInt(Object, Object)}.
 */
@FunctionalInterface
public interface ObjObjToIntFunction<T, U> extends ToIntBiFunction<T, U> {
}
