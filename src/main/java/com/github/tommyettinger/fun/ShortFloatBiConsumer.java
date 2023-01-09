package com.github.tommyettinger.fun;

/**
 * Represents an operation that accepts
 * two input arguments and returns no result.
 * <br>
 * This is a functional interface
 * whose functional method is {@link #accept(short, float)}.
 */
@FunctionalInterface
public interface ShortFloatBiConsumer {
  /**
   * Performs this operation on the given arguments.
   *
   * @param first the first input argument
   * @param second the second input argument
   */
  float accept(short first, float second);
}
