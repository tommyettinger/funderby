package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code boolean}-valued operand that produces
 * a {@code int}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsInt(boolean)}.
 */
@FunctionalInterface
public interface BooleanToIntFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  int applyAsInt(boolean value);
}
