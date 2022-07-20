package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code boolean}-valued operand that produces
 * a {@code int}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsInt(boolean)}.
 */
@FunctionalInterface
public interface BooleanToIntFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  int applyAsInt(boolean value);
}
