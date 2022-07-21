package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code long}-valued operand and a {@code long}-valued
 * operand that produces a {@code double}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsDouble(long, long)}.
 */
@FunctionalInterface
public interface LongLongToDoubleBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  double applyAsDouble(long first, long second);
}
