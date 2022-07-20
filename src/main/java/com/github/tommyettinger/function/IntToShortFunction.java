package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code int}-valued operand that produces
 * a {@code short}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsShort(int)}.
 */
@FunctionalInterface
public interface IntToShortFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  short applyAsShort(int value);
}
