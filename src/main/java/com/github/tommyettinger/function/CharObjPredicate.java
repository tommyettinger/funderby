package com.github.tommyettinger.function;

/**
 * Represents an operation that accepts
 * two input arguments and returns a {@code boolean} result.
 * <br>
 * This is a functional interface
 * whose functional method is {@link #test(char, Object)}.
 */
@FunctionalInterface
public interface CharObjPredicate<T> {
  /**
   * Evaluates this predicate on the given arguments.
   *
   * @param first the first input argument
   * @param second the second input argument
   * @return {@code true} if the input arguments match the predicate,
   * otherwise {@code false}
   */
  boolean test(char first, T second);
}
