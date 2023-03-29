package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code double}-valued operand that produces
 * a {@code long}-valued result.
 * <br>
 * This is identical to {@code DoubleToLongFunction} in Java 8, and is present here so environments
 * that support lambdas but not Java 8 APIs (such as RoboVM) can use it.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsLong(double)}.
 */
@FunctionalInterface
public interface DoubleToLongFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  long applyAsLong(double value);
}
