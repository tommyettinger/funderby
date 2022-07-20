package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code double}-valued operand that produces
 * a {@code short}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsShort(double)}.
 */
@FunctionalInterface
public interface DoubleToShortFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  short applyAsShort(double value);
}
