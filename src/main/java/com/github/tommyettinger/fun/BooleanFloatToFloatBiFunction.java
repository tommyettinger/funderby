package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code boolean}-valued operand and a {@code float}-valued
 * operand that produces a {@code float}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsFloat(boolean, float)}.
 */
@FunctionalInterface
public interface BooleanFloatToFloatBiFunction {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  float applyAsFloat(boolean first, float second);
}
