package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code double}-valued operand and a {@code char}-valued
 * operand that produces a {@code char}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsChar(double, char)}.
 */
@FunctionalInterface
public interface DoubleCharToCharBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  char applyAsChar(double first, char second);
}
