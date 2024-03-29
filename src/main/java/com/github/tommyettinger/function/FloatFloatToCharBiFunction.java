package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code float}-valued operand and a {@code float}-valued
 * operand that produces a {@code char}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsChar(float, float)}.
 */
@FunctionalInterface
public interface FloatFloatToCharBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  char applyAsChar(float first, float second);
}
