package com.github.tommyettinger.fun;

/**
 * Represents an operation that accepts a single {@code char}-valued argument and
 * returns no result.
 * <br>
 * This is a functional interface whose functional method is {@link #accept(char)}.
 */
@FunctionalInterface
public interface CharConsumer {
  /**
   * Performs this operation on the given argument.
   *
   * @param value the input argument
   */
  void accept(char value);
}
