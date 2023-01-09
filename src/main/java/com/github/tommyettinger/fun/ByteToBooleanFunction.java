package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code byte}-valued operand that produces
 * a {@code boolean}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsBoolean(byte)}.
 */
@FunctionalInterface
public interface ByteToBooleanFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  boolean applyAsBoolean(byte value);
}
