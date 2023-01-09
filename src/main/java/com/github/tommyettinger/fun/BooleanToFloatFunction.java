package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code boolean}-valued operand that produces
 * a {@code float}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsFloat(boolean)}.
 */
@FunctionalInterface
public interface BooleanToFloatFunction {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  float applyAsFloat(boolean value);
}
