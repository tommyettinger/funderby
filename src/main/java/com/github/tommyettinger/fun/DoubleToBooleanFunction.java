package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code double}-valued operand that produces
 * a {@code boolean}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsBoolean(double)}.
 */
@FunctionalInterface
public interface DoubleToBooleanFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  boolean applyAsBoolean(double value);
}
