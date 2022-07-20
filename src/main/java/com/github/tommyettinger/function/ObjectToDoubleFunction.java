package com.github.tommyettinger.function;

import java.util.function.ToDoubleFunction;

/**
 * Represents an operation on a single {@code T}-valued operand that produces
 * a {@code double}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsDouble(Object)}.
 */
@FunctionalInterface
public interface ObjectToDoubleFunction<T> extends ToDoubleFunction<T> {
}
