package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code boolean}-valued operand that produces
 * a {@code float}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsFloat(boolean)}.
 */
@FunctionalInterface
public interface BooleanToFloatFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  float applyAsFloat(boolean value);
}
