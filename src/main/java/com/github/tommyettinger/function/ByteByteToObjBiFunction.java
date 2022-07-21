package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code byte}-valued operand and a {@code byte}-valued
 * operand that produces a {@code R}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #apply(byte, byte)}.
 */
@FunctionalInterface
public interface ByteByteToObjBiFunction<R> {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  R apply(byte first, byte second);
}
