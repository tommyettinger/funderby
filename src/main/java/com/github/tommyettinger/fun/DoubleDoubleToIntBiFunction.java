package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code double}-valued operand and a {@code double}-valued
 * operand that produces a {@code int}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsInt(double, double)}.
 */
@FunctionalInterface
public interface DoubleDoubleToIntBiFunction {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  int applyAsInt(double first, double second);
}
