package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code char}-valued operand that produces
 * a {@code float}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsFloat(char)}.
 */
@FunctionalInterface
public interface CharToFloatFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  float applyAsFloat(char value);
}
