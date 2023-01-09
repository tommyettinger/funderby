package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code long}-valued operand and a {@code int}-valued
 * operand that produces a {@code int}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsInt(long, int)}.
 */
@FunctionalInterface
public interface LongIntToIntBiFunction {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  int applyAsInt(long first, int second);
}
