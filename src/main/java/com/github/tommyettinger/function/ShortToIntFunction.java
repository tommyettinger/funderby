package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code short}-valued operand that produces
 * a {@code int}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsInt(short)}.
 */
@FunctionalInterface
public interface ShortToIntFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  int applyAsInt(short value);
}
