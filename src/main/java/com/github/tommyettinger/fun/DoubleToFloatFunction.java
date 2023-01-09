package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code double}-valued operand that produces
 * a {@code float}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsFloat(double)}.
 */
@FunctionalInterface
public interface DoubleToFloatFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  float applyAsFloat(double value);
}
