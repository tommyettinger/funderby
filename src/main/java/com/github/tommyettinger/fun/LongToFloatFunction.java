package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code long}-valued operand that produces
 * a {@code float}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsFloat(long)}.
 */
@FunctionalInterface
public interface LongToFloatFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  float applyAsFloat(long value);
}
