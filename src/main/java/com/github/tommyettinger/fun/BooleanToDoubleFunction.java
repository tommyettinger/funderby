package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code boolean}-valued operand that produces
 * a {@code double}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsDouble(boolean)}.
 */
@FunctionalInterface
public interface BooleanToDoubleFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  double applyAsDouble(boolean value);
}
