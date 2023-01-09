package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code char}-valued operand and a {@code char}-valued
 * operand that produces a {@code char}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsChar(char, char)}.
 */
@FunctionalInterface
public interface CharCharToCharBiFunction {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  char applyAsChar(char first, char second);
}
