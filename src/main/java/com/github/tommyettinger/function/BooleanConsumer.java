package com.github.tommyettinger.function;

/**
 * Represents an operation that accepts a single {@code boolean}-valued argument and
 * returns no result.
 * <br>
 * This is a functional interface whose functional method is {@link #accept(boolean)}.
 */
@FunctionalInterface
public interface BooleanConsumer {
  /**
   * Performs this operation on the given argument.
   *
   * @param value the input argument
   */
  void accept(boolean value);
}
