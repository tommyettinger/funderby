package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code byte}-valued operand that produces
 * a {@code int}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsInt(byte)}.
 */
@FunctionalInterface
public interface ByteToIntFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  int applyAsInt(byte value);
}
