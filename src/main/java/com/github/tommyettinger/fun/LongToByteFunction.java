package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code long}-valued operand that produces
 * a {@code byte}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsByte(long)}.
 */
@FunctionalInterface
public interface LongToByteFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  byte applyAsByte(long value);
}
