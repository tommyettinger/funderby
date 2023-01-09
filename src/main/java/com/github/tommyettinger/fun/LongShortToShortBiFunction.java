package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code long}-valued operand and a {@code short}-valued
 * operand that produces a {@code short}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsShort(long, short)}.
 */
@FunctionalInterface
public interface LongShortToShortBiFunction {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  short applyAsShort(long first, short second);
}
