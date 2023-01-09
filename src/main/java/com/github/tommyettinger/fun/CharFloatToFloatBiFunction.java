package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code char}-valued operand and a {@code float}-valued
 * operand that produces a {@code float}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsFloat(char, float)}.
 */
@FunctionalInterface
public interface CharFloatToFloatBiFunction {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  float applyAsFloat(char first, float second);
}
