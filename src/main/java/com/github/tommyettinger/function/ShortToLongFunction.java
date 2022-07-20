package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code short}-valued operand that produces
 * a {@code long}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsLong(short)}.
 */
@FunctionalInterface
public interface ShortToLongFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  long applyAsLong(short value);
}
