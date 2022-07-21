package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code int}-valued operand and a {@code float}-valued
 * operand that produces a {@code float}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsFloat(int, float)}.
 */
@FunctionalInterface
public interface IntFloatToFloatFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  float applyAsFloat(int first, float second);
}
