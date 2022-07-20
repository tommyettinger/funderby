package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code double}-valued operand that produces
 * a {@code float}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsFloat(double)}.
 */
@FunctionalInterface
public interface DoubleToFloatFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  float applyAsFloat(double value);
}
