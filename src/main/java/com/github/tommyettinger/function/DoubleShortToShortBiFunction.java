package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code double}-valued operand and a {@code short}-valued
 * operand that produces a {@code short}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsShort(double, short)}.
 */
@FunctionalInterface
public interface DoubleShortToShortBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  short applyAsShort(double first, short second);
}
