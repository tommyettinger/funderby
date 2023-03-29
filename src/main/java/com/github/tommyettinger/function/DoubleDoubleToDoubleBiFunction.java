package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code double}-valued operand and a {@code double}-valued
 * operand that produces a {@code double}-valued result.
 * <br>
 * This is identical to {@code DoubleBinaryOperator} in Java 8, and is present here so environments
 * that support lambdas but not Java 8 APIs (such as RoboVM) can use it.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsDouble(double, double)}.
 */
@FunctionalInterface
public interface DoubleDoubleToDoubleBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  double applyAsDouble(double first, double second);
}
