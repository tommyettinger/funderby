package com.github.tommyettinger.function;

/**
 * Represents an operation that accepts a single {@code long}-valued argument and
 * returns no result.
 * <br>
 * This is identical to LongConsumer in Java 8, and is present here so environments
 * that support lambdas but not Java 8 APIs (such as RoboVM) can use it.
 * <br>
 * This is a functional interface whose functional method is {@link #accept(long)}.
 */
@FunctionalInterface
public interface LongConsumer {
  /**
   * Performs this operation on the given argument.
   *
   * @param value the input argument
   */
  void accept(long value);
}
