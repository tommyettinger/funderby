package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code double}-valued operand and a {@code long}-valued
 * operand that produces a {@code long}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsLong(double, long)}.
 */
@FunctionalInterface
public interface DoubleLongToLongBiFunction {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  long applyAsLong(double first, long second);
}
