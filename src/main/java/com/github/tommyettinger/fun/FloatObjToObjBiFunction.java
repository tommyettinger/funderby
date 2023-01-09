package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code float}-valued operand and a {@code T}-valued
 * operand that produces a {@code R}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #apply(float, Object)}.
 */
@FunctionalInterface
public interface FloatObjToObjBiFunction<T, R> {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  R apply(float first, T second);
}
