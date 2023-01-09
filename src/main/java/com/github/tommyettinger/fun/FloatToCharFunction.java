package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code float}-valued operand that produces
 * a {@code char}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsChar(float)}.
 */
@FunctionalInterface
public interface FloatToCharFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  char applyAsChar(float value);
}
