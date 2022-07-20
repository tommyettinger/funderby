package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code boolean}-valued operand that produces
 * a {@code short}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsShort(boolean)}.
 */
@FunctionalInterface
public interface BooleanToShortFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  short applyAsShort(boolean value);
}
