package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code boolean}-valued operand and a {@code boolean}-valued
 * operand that produces a {@code int}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsInt(boolean, boolean)}.
 */
@FunctionalInterface
public interface BooleanBooleanToIntBiFunction {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  int applyAsInt(boolean first, boolean second);
}
