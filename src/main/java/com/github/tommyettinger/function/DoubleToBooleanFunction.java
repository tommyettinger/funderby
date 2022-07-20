package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code double}-valued operand that produces
 * a {@code boolean}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsBoolean(double)}.
 */
@FunctionalInterface
public interface DoubleToBooleanFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  boolean applyAsBoolean(double value);
}
