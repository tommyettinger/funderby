package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code char}-valued operand and a {@code double}-valued
 * operand that produces a {@code double}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsDouble(char, double)}.
 */
@FunctionalInterface
public interface CharDoubleToDoubleFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  double applyAsDouble(char first, double second);
}
