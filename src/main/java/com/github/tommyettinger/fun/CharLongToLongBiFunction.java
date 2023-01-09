package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code char}-valued operand and a {@code long}-valued
 * operand that produces a {@code long}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsLong(char, long)}.
 */
@FunctionalInterface
public interface CharLongToLongBiFunction {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  long applyAsLong(char first, long second);
}
