package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code char}-valued operand and a {@code short}-valued
 * operand that produces a {@code char}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsChar(char, short)}.
 */
@FunctionalInterface
public interface CharShortToCharBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  char applyAsChar(char first, short second);
}
