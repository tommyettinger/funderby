package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code double}-valued operand and a {@code float}-valued
 * operand that produces a {@code float}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsFloat(double, float)}.
 */
@FunctionalInterface
public interface DoubleFloatToFloatBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  float applyAsFloat(double first, float second);
}
