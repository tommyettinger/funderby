package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code short}-valued operand that produces
 * a {@code byte}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsByte(short)}.
 */
@FunctionalInterface
public interface ShortToByteFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  byte applyAsByte(short value);
}
