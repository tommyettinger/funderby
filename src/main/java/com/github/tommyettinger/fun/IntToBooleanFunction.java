package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code int}-valued operand that produces
 * a {@code boolean}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsBoolean(int)}.
 */
@FunctionalInterface
public interface IntToBooleanFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  boolean applyAsBoolean(int value);
}
