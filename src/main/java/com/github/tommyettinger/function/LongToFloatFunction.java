package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code long}-valued operand that produces
 * a {@code float}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsFloat(long)}.
 */
@FunctionalInterface
public interface LongToFloatFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  float applyAsFloat(long value);
}
