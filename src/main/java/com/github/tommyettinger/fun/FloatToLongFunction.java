package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code float}-valued operand that produces
 * a {@code long}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsLong(float)}.
 */
@FunctionalInterface
public interface FloatToLongFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  long applyAsLong(float value);
}
