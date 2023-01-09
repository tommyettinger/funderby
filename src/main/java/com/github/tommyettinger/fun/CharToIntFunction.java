package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code char}-valued operand that produces
 * a {@code int}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsInt(char)}.
 */
@FunctionalInterface
public interface CharToIntFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  int applyAsInt(char value);
}
