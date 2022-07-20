package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code float}-valued operand that produces
 * a {@code byte}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsByte(float)}.
 */
@FunctionalInterface
public interface FloatToByteFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  byte applyAsByte(float value);
}
