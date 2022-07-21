package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code float}-valued operand and a {@code float}-valued
 * operand that produces a {@code int}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsInt(float, float)}.
 */
@FunctionalInterface
public interface FloatFloatToIntFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  int applyAsInt(float first, float second);
}
