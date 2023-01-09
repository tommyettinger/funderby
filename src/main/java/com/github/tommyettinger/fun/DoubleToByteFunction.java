package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code double}-valued operand that produces
 * a {@code byte}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsByte(double)}.
 */
@FunctionalInterface
public interface DoubleToByteFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  byte applyAsByte(double value);
}
