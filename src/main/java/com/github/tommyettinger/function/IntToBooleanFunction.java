package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code int}-valued operand that produces
 * a {@code boolean}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsBoolean(int)}.
 */
@FunctionalInterface
public interface IntToBooleanFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  boolean applyAsBoolean(int value);
}
