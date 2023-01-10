package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code float}-valued operand and a {@code short}-valued
 * operand that produces a {@code short}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsShort(float, short)}.
 */
@FunctionalInterface
public interface FloatShortToShortBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  short applyAsShort(float first, short second);
}
