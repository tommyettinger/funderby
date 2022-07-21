package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code boolean}-valued operand and a {@code boolean}-valued
 * operand that produces a {@code char}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsChar(boolean, boolean)}.
 */
@FunctionalInterface
public interface BooleanBooleanToCharBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  char applyAsChar(boolean first, boolean second);
}
