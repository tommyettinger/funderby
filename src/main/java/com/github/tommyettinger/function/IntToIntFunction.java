package com.github.tommyettinger.function;

import java.util.function.IntUnaryOperator;

/**
 * Represents an operation on a single {@code int}-valued operand that produces
 * a {@code int}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsInt(int)}.
 */
@FunctionalInterface
public interface IntToIntFunction extends IntUnaryOperator {
}
