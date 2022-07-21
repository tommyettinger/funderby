package com.github.tommyettinger.function;

/**
 * Represents an operation that accepts two input arguments and returns no
 * result.  This is the two-arity specialization of {@link Consumer}.
 * <br>
 * This is a functional interface
 * whose functional method is {@link #accept(Object, boolean)}.
 */
@FunctionalInterface
public interface ObjBooleanBiConsumer<T> {
  /**
   * Performs this operation on the given arguments.
   *
   * @param first the first input argument
   * @param second the second input argument
   */
  boolean apply(T first, boolean second);
}
