package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code char}-valued operand that produces
 * a {@code long}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsLong(char)}.
 */
@FunctionalInterface
public interface CharToLongFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  long applyAsLong(char value);
}
