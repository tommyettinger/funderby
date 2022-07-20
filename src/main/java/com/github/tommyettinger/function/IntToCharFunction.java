package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code int}-valued operand that produces
 * a {@code char}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsChar(int)}.
 */
@FunctionalInterface
public interface IntToCharFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  char applyAsChar(int value);
}
