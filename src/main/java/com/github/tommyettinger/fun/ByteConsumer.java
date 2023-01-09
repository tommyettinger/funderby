package com.github.tommyettinger.fun;

/**
 * Represents an operation that accepts a single {@code byte}-valued argument and
 * returns no result.
 * <br>
 * This is a functional interface whose functional method is {@link #accept(byte)}.
 */
@FunctionalInterface
public interface ByteConsumer {
  /**
   * Performs this operation on the given argument.
   *
   * @param value the input argument
   */
  void accept(byte value);
}
