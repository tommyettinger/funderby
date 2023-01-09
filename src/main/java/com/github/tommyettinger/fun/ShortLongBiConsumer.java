package com.github.tommyettinger.fun;

/**
 * Represents an operation that accepts
 * two input arguments and returns no result.
 * <br>
 * This is a functional interface
 * whose functional method is {@link #accept(short, long)}.
 */
@FunctionalInterface
public interface ShortLongBiConsumer {
  /**
   * Performs this operation on the given arguments.
   *
   * @param first the first input argument
   * @param second the second input argument
   */
  long accept(short first, long second);
}
