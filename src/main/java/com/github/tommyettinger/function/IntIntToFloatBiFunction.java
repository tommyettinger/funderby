package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code int}-valued operand and a {@code int}-valued
 * operand that produces a {@code float}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsFloat(int, int)}.
 */
@FunctionalInterface
public interface IntIntToFloatBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  float applyAsFloat(int first, int second);
}
