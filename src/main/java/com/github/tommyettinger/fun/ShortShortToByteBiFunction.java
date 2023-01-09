package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code short}-valued operand and a {@code short}-valued
 * operand that produces a {@code byte}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsByte(short, short)}.
 */
@FunctionalInterface
public interface ShortShortToByteBiFunction {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  byte applyAsByte(short first, short second);
}
