package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code short}-valued operand and a {@code float}-valued
 * operand that produces a {@code float}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsFloat(short, float)}.
 */
@FunctionalInterface
public interface ShortFloatToFloatBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  float applyAsFloat(short first, float second);
}
