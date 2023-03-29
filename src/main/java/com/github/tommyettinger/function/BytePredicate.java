package com.github.tommyettinger.function;

/**
 * Represents an operation that accepts a single {@code byte}-valued argument and
 * returns a {@code boolean} result.
 * <br>
 * This is a functional interface whose functional method is {@link #test(byte)}.
 */
@FunctionalInterface
public interface BytePredicate {
  /**
   * Evaluates this predicate on the given argument.
   *
   * @param value the input argument
   * @return {@code true} if the input argument matches the predicate,
   * otherwise {@code false}
   */
  boolean test(byte value);
}
