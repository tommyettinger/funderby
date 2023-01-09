package com.github.tommyettinger.fun;

import java.util.function.ToLongFunction;

/**
 * Represents an operation on a single {@code T}-valued operand that produces
 * a {@code long}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsLong(Object)}.
 */
@FunctionalInterface
public interface ObjToLongFunction<T> extends ToLongFunction<T> {
}
