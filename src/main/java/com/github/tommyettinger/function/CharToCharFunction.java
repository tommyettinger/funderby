package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code char}-valued operand that produces
 * a {@code char}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsChar(char)}.
 */
@FunctionalInterface
public interface CharToCharFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  char applyAsChar(char value);
}
