package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code T}-valued operand and a {@code double}-valued
 * operand that produces a {@code double}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsDouble(Object, double)}.
 */
@FunctionalInterface
public interface ObjDoubleToDoubleBiFunction<T> {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  double applyAsDouble(T first, double second);
}
