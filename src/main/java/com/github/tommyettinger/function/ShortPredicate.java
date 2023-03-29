package com.github.tommyettinger.function;

/**
 * Represents an operation that accepts a single {@code short}-valued argument and
 * returns a {@code boolean} result.
 * <br>
 * This is a functional interface whose functional method is {@link #test(short)}.
 */
@FunctionalInterface
public interface ShortPredicate {
  /**
   * Evaluates this predicate on the given argument.
   *
   * @param value the input argument
   * @return {@code true} if the input argument matches the predicate,
   * otherwise {@code false}
   */
  boolean test(short value);
}
