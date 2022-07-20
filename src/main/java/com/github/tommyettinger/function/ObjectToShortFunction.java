package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code T}-valued operand that produces
 * a {@code short}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsShort(Object)}.
 */
@FunctionalInterface
public interface ObjectToShortFunction<T> {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  short applyAsShort(T value);
}
