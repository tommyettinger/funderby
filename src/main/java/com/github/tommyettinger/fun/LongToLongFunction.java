package com.github.tommyettinger.fun;

import java.util.function.LongUnaryOperator;

/**
 * Represents an operation on a single {@code long}-valued operand that produces
 * a {@code long}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsLong(long)}.
 */
@FunctionalInterface
public interface LongToLongFunction extends LongUnaryOperator {
}
