package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code boolean}-valued operand that produces
 * a {@code byte}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsByte(boolean)}.
 */
@FunctionalInterface
public interface BooleanToByteFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  byte applyAsByte(boolean value);
}
