package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code int}-valued operand that produces
 * a {@code short}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsShort(int)}.
 */
@FunctionalInterface
public interface IntToShortFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  short applyAsShort(int value);
}
