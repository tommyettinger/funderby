package com.github.tommyettinger.function;

import java.util.function.ToIntFunction;

/**
 * Represents an operation on a single {@code T}-valued operand that produces
 * a {@code int}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsInt(Object)}.
 */
@FunctionalInterface
public interface ObjToIntFunction<T> extends ToIntFunction<T> {
}
