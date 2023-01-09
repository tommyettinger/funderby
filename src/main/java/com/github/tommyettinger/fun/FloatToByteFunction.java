package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code float}-valued operand that produces
 * a {@code byte}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsByte(float)}.
 */
@FunctionalInterface
public interface FloatToByteFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  byte applyAsByte(float value);
}
