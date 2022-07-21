package com.github.tommyettinger.function;

/**
 * Represents an operation that accepts two input arguments and returns no
 * result.  This is the two-arity specialization of {@link Consumer}.
 * <br>
 * This is a functional interface
 * whose functional method is {@link #accept(byte, byte)}.
 */
@FunctionalInterface
public interface ByteByteBiConsumer {
  /**
   * Performs this operation on the given arguments.
   *
   * @param first the first input argument
   * @param second the second input argument
   */
  byte apply(byte first, byte second);
}
