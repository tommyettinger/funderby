package com.github.tommyettinger.function;

import java.util.function.DoubleBinaryOperator;

/**
 * Represents an operation on a {@code double}-valued operand and a {@code double}-valued
 * operand that produces a {@code double}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsDouble(double, double)}.
 */
@FunctionalInterface
public interface DoubleDoubleToDoubleFunction extends DoubleBinaryOperator {
}
