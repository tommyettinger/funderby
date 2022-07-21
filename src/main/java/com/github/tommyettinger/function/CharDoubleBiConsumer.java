package com.github.tommyettinger.function;

/**
 * Represents an operation that accepts
 * two input arguments and returns no result.
 * <br>
 * This is a functional interface
 * whose functional method is {@link #accept(char, double)}.
 */
@FunctionalInterface
public interface CharDoubleBiConsumer {
  /**
   * Performs this operation on the given arguments.
   *
   * @param first the first input argument
   * @param second the second input argument
   */
  double accept(char first, double second);
}