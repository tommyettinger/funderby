package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code int}-valued operand and a {@code double}-valued
 * operand that produces a {@code double}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsDouble(int, double)}.
 */
@FunctionalInterface
public interface IntDoubleToDoubleBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  double applyAsDouble(int first, double second);
}
