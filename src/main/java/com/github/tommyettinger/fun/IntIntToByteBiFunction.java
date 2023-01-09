package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code int}-valued operand and a {@code int}-valued
 * operand that produces a {@code byte}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsByte(int, int)}.
 */
@FunctionalInterface
public interface IntIntToByteBiFunction {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  byte applyAsByte(int first, int second);
}
