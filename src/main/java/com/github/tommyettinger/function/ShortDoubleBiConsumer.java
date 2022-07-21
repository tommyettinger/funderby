package com.github.tommyettinger.function;

/**
 * Represents an operation that accepts two input arguments and returns no
 * result.  This is the two-arity specialization of {@link Consumer}.
 * <br>
 * This is a functional interface
 * whose functional method is {@link #accept(short, double)}.
 */
@FunctionalInterface
public interface ShortDoubleBiConsumer {
  /**
   * Performs this operation on the given arguments.
   *
   * @param first the first input argument
   * @param second the second input argument
   */
  double apply(short first, double second);
}
