package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code short}-valued operand that produces
 * a {@code short}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsShort(short)}.
 */
@FunctionalInterface
public interface ShortToShortFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  short applyAsShort(short value);
}
