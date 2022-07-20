package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code float}-valued operand that produces
 * a {@code short}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsShort(float)}.
 */
@FunctionalInterface
public interface FloatToShortFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  short applyAsShort(float value);
}
