package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code byte}-valued operand and a {@code double}-valued
 * operand that produces a {@code byte}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsByte(byte, double)}.
 */
@FunctionalInterface
public interface ByteDoubleToByteBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  byte applyAsByte(byte first, double second);
}
