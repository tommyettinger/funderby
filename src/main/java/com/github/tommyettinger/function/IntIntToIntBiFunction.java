package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code int}-valued operand and a {@code int}-valued
 * operand that produces a {@code int}-valued result.
 * <br>
 * This is identical to {@code IntBinaryOperator} in Java 8, and is present here so environments
 * that support lambdas but not Java 8 APIs (such as RoboVM) can use it.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsInt(int, int)}.
 */
@FunctionalInterface
public interface IntIntToIntBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  int applyAsInt(int first, int second);
}
