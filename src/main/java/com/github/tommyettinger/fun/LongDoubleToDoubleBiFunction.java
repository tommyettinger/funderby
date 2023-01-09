package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code long}-valued operand and a {@code double}-valued
 * operand that produces a {@code double}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsDouble(long, double)}.
 */
@FunctionalInterface
public interface LongDoubleToDoubleBiFunction {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  double applyAsDouble(long first, double second);
}
