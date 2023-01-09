package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code double}-valued operand and a {@code double}-valued
 * operand that produces a {@code short}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsShort(double, double)}.
 */
@FunctionalInterface
public interface DoubleDoubleToShortBiFunction {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  short applyAsShort(double first, double second);
}
