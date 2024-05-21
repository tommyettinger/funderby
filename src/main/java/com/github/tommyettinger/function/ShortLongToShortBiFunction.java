package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code short}-valued operand and a {@code long}-valued
 * operand that produces a {@code short}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsShort(short, long)}.
 */
@FunctionalInterface
public interface ShortLongToShortBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  short applyAsShort(short first, long second);
}
