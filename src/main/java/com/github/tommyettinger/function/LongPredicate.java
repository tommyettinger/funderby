package com.github.tommyettinger.function;

/**
 * Represents an operation that accepts a single {@code long}-valued argument and
 * returns a {@code boolean} result.
 * <br>
 * This is identical to {@code LongPredicate} in Java 8, and is present here so environments
 * that support lambdas but not Java 8 APIs (such as RoboVM) can use it.
 * <br>
 * This is a functional interface whose functional method is {@link #test(long)}.
 */
@FunctionalInterface
public interface LongPredicate {
  /**
   * Evaluates this predicate on the given argument.
   *
   * @param value the input argument
   * @return {@code true} if the input argument matches the predicate,
   * otherwise {@code false}
   */
  boolean test(long value);
}
