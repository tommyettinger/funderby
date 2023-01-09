package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code float}-valued operand and a {@code float}-valued
 * operand that produces a {@code byte}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsByte(float, float)}.
 */
@FunctionalInterface
public interface FloatFloatToByteBiFunction {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  byte applyAsByte(float first, float second);
}
