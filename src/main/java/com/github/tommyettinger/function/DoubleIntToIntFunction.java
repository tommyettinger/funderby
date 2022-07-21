package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code double}-valued operand and a {@code int}-valued
 * operand that produces a {@code int}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsInt(double, int)}.
 */
@FunctionalInterface
public interface DoubleIntToIntFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  int applyAsInt(double first, int second);
}
