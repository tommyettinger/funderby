package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code float}-valued operand that produces
 * a {@code double}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsDouble(float)}.
 */
@FunctionalInterface
public interface FloatToDoubleFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  double applyAsDouble(float value);
}
