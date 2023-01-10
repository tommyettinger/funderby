package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code double}-valued operand and a {@code double}-valued
 * operand that produces a {@code float}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsFloat(double, double)}.
 */
@FunctionalInterface
public interface DoubleDoubleToFloatBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  float applyAsFloat(double first, double second);
}
