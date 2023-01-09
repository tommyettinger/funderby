package com.github.tommyettinger.fun;

/**
 * Represents an operation that accepts a single {@code float}-valued argument and
 * returns no result.
 * <br>
 * This is a functional interface whose functional method is {@link #accept(float)}.
 */
@FunctionalInterface
public interface FloatConsumer {
  /**
   * Performs this operation on the given argument.
   *
   * @param value the input argument
   */
  void accept(float value);
}
