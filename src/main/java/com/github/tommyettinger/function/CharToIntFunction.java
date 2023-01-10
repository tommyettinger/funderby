package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code char}-valued operand that produces
 * a {@code int}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsInt(char)}.
 */
@FunctionalInterface
public interface CharToIntFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  int applyAsInt(char value);
}
