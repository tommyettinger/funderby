package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code byte}-valued operand that produces
 * a {@code char}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsChar(byte)}.
 */
@FunctionalInterface
public interface ByteToCharFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  char applyAsChar(byte value);
}
