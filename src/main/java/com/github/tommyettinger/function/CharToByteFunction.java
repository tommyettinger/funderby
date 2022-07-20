package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code char}-valued operand that produces
 * a {@code byte}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsByte(char)}.
 */
@FunctionalInterface
public interface CharToByteFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  byte applyAsByte(char value);
}
