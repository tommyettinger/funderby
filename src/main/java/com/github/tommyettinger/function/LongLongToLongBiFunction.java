package com.github.tommyettinger.function;

import java.util.function.LongBinaryOperator;

/**
 * Represents an operation on a {@code long}-valued operand and a {@code long}-valued
 * operand that produces a {@code long}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsLong(long, long)}.
 */
@FunctionalInterface
public interface LongLongToLongBiFunction extends LongBinaryOperator {
}
