package com.github.tommyettinger.function;

/**
 * Represents an operation that accepts
 * two input arguments and returns no result.
 * <br>
 * This is a functional interface
 * whose functional method is {@link #accept(int, short)}.
 */
@FunctionalInterface
public interface IntShortBiConsumer {
  /**
   * Performs this operation on the given arguments.
   *
   * @param first the first input argument
   * @param second the second input argument
   */
  void accept(int first, short second);
}
