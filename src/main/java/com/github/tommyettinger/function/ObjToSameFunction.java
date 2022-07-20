package com.github.tommyettinger.function;

import java.util.function.UnaryOperator;

/**
 * Represents an operation on a single {@code T}-valued operand that produces
 * a {@code T}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #apply(Object)}.
 */
@FunctionalInterface
public interface ObjToSameFunction<T> extends UnaryOperator<T> {
}
