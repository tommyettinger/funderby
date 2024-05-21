package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code float}-valued operand and a {@code short}-valued
 * operand that produces a {@code float}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsFloat(float, short)}.
 */
@FunctionalInterface
public interface FloatShortToFloatBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  float applyAsFloat(float first, short second);
}
