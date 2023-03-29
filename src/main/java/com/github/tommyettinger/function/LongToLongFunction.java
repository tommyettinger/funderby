package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code long}-valued operand that produces
 * a {@code long}-valued result.
 * <br>
 * This is identical to {@code LongUnaryOperator} in Java 8, and is present here so environments
 * that support lambdas but not Java 8 APIs (such as RoboVM) can use it.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsLong(long)}.
 */
@FunctionalInterface
public interface LongToLongFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  long applyAsLong(long value);
}
