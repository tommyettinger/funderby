package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code float}-valued operand that produces
 * a {@code long}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsLong(float)}.
 */
@FunctionalInterface
public interface FloatToLongFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  long applyAsLong(float value);
}
