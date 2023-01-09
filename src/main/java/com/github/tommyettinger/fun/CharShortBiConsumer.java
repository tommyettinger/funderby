package com.github.tommyettinger.fun;

/**
 * Represents an operation that accepts
 * two input arguments and returns no result.
 * <br>
 * This is a functional interface
 * whose functional method is {@link #accept(char, short)}.
 */
@FunctionalInterface
public interface CharShortBiConsumer {
  /**
   * Performs this operation on the given arguments.
   *
   * @param first the first input argument
   * @param second the second input argument
   */
  short accept(char first, short second);
}
