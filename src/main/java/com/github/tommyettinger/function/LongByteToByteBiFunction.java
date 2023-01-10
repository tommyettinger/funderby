package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code long}-valued operand and a {@code byte}-valued
 * operand that produces a {@code byte}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsByte(long, byte)}.
 */
@FunctionalInterface
public interface LongByteToByteBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  byte applyAsByte(long first, byte second);
}
