package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code char}-valued operand that produces
 * a {@code boolean}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsBoolean(char)}.
 */
@FunctionalInterface
public interface CharToBooleanFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  boolean applyAsBoolean(char value);
}
