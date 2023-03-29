package com.github.tommyettinger.function;

/**
 * Represents an operation that accepts a single {@code char}-valued argument and
 * returns a {@code boolean} result.
 * <br>
 * This is a functional interface whose functional method is {@link #test(char)}.
 */
@FunctionalInterface
public interface CharPredicate {
  /**
   * Evaluates this predicate on the given argument.
   *
   * @param value the input argument
   * @return {@code true} if the input argument matches the predicate,
   * otherwise {@code false}
   */
  boolean test(char value);
}
