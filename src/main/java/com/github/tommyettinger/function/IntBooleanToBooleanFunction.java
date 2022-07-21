package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code int}-valued operand and a {@code boolean}-valued
 * operand that produces a {@code boolean}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsBoolean(int, boolean)}.
 */
@FunctionalInterface
public interface IntBooleanToBooleanFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  boolean applyAsBoolean(int first, boolean second);
}
