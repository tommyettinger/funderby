package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code byte}-valued operand and a {@code byte}-valued
 * operand that produces a {@code double}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsDouble(byte, byte)}.
 */
@FunctionalInterface
public interface ByteByteToDoubleBiFunction {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  double applyAsDouble(byte first, byte second);
}
