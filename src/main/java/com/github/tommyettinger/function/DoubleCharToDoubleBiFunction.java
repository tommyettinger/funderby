package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code double}-valued operand and a {@code char}-valued
 * operand that produces a {@code double}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsDouble(double, char)}.
 */
@FunctionalInterface
public interface DoubleCharToDoubleBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  double applyAsDouble(double first, char second);
}
