package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code short}-valued operand and a {@code double}-valued
 * operand that produces a {@code double}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsDouble(short, double)}.
 */
@FunctionalInterface
public interface ShortDoubleToDoubleBiFunction {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  double applyAsDouble(short first, double second);
}
