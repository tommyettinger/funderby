package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code int}-valued operand and a {@code double}-valued
 * operand that produces a {@code int}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsInt(int, double)}.
 */
@FunctionalInterface
public interface IntDoubleToIntBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  int applyAsInt(int first, double second);
}
