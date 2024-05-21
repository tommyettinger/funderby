package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code long}-valued operand and a {@code short}-valued
 * operand that produces a {@code long}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsLong(long, short)}.
 */
@FunctionalInterface
public interface LongShortToLongBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  long applyAsLong(long first, short second);
}