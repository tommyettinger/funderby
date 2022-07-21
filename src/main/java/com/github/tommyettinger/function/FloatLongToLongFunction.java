package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code float}-valued operand and a {@code long}-valued
 * operand that produces a {@code long}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsLong(float, long)}.
 */
@FunctionalInterface
public interface FloatLongToLongFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  long applyAsLong(float first, long second);
}
