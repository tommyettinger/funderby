package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code char}-valued operand and a {@code boolean}-valued
 * operand that produces a {@code boolean}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsBoolean(char, boolean)}.
 */
@FunctionalInterface
public interface CharBooleanToBooleanFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  boolean applyAsBoolean(char first, boolean second);
}