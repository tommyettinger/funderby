package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code short}-valued operand and a {@code long}-valued
 * operand that produces a {@code long}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsLong(short, long)}.
 */
@FunctionalInterface
public interface ShortLongToLongBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  long applyAsLong(short first, long second);
}
