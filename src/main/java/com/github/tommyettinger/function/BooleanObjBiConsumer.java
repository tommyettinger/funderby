package com.github.tommyettinger.function;

/**
 * Represents an operation that accepts
 * two input arguments and returns no result.
 * <br>
 * This is a functional interface
 * whose functional method is {@link #accept(boolean, Object)}.
 */
@FunctionalInterface
public interface BooleanObjBiConsumer<T> {
  /**
   * Performs this operation on the given arguments.
   *
   * @param first the first input argument
   * @param second the second input argument
   */
  T accept(boolean first, T second);
}
