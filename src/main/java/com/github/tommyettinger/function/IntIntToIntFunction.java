package com.github.tommyettinger.function;

import java.util.function.IntBinaryOperator;

/**
 * Represents an operation on a {@code int}-valued operand and a {@code int}-valued
 * operand that produces a {@code int}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsInt(int, int)}.
 */
@FunctionalInterface
public interface IntIntToIntFunction extends IntBinaryOperator {
}
