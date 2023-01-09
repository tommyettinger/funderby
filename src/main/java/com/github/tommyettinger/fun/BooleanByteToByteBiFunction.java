package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code boolean}-valued operand and a {@code byte}-valued
 * operand that produces a {@code byte}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsByte(boolean, byte)}.
 */
@FunctionalInterface
public interface BooleanByteToByteBiFunction {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  byte applyAsByte(boolean first, byte second);
}
