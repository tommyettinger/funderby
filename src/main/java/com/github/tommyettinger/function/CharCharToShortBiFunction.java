package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code char}-valued operand and a {@code char}-valued
 * operand that produces a {@code short}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsShort(char, char)}.
 */
@FunctionalInterface
public interface CharCharToShortBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  short applyAsShort(char first, char second);
}
