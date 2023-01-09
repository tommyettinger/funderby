package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code int}-valued operand and a {@code byte}-valued
 * operand that produces a {@code byte}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsByte(int, byte)}.
 */
@FunctionalInterface
public interface IntByteToByteBiFunction {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  byte applyAsByte(int first, byte second);
}
