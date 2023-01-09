package com.github.tommyettinger.fun;

/**
 * Represents an operation that accepts a single {@code short}-valued argument and
 * returns no result.
 * <br>
 * This is a functional interface whose functional method is {@link #accept(short)}.
 */
@FunctionalInterface
public interface ShortConsumer {
  /**
   * Performs this operation on the given argument.
   *
   * @param value the input argument
   */
  void accept(short value);
}
