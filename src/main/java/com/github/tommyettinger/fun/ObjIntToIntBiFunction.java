package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code T}-valued operand and a {@code int}-valued
 * operand that produces a {@code int}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsInt(Object, int)}.
 */
@FunctionalInterface
public interface ObjIntToIntBiFunction<T> {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  int applyAsInt(T first, int second);
}
