package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code char}-valued operand that produces
 * a {@code double}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsDouble(char)}.
 */
@FunctionalInterface
public interface CharToDoubleFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  double applyAsDouble(char value);
}
