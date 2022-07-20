package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code byte}-valued operand that produces
 * a {@code boolean}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsBoolean(byte)}.
 */
@FunctionalInterface
public interface ByteToBooleanFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  boolean applyAsBoolean(byte value);
}
