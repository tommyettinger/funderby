package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code int}-valued operand that produces
 * a {@code byte}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsByte(int)}.
 */
@FunctionalInterface
public interface IntToByteFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  byte applyAsByte(int value);
}
