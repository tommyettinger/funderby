package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code boolean}-valued operand that produces
 * a {@code double}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsDouble(boolean)}.
 */
@FunctionalInterface
public interface BooleanToDoubleFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  double applyAsDouble(boolean value);
}
