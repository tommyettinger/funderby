package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code short}-valued operand that produces
 * a {@code double}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsDouble(short)}.
 */
@FunctionalInterface
public interface ShortToDoubleFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  double applyAsDouble(short value);
}
