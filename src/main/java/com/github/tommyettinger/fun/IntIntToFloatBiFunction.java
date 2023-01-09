package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code int}-valued operand and a {@code int}-valued
 * operand that produces a {@code float}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsFloat(int, int)}.
 */
@FunctionalInterface
public interface IntIntToFloatBiFunction {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  float applyAsFloat(int first, int second);
}
