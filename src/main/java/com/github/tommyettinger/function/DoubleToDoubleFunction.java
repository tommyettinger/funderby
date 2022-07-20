package com.github.tommyettinger.function;

import java.util.function.DoubleUnaryOperator;

/**
 * Represents an operation on a single {@code double}-valued operand that produces
 * a {@code double}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsDouble(double)}.
 */
@FunctionalInterface
public interface DoubleToDoubleFunction extends DoubleUnaryOperator {
}
