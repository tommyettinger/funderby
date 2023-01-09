package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code float}-valued operand and a {@code float}-valued
 * operand that produces a {@code R}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #apply(float, float)}.
 */
@FunctionalInterface
public interface FloatFloatToObjBiFunction<R> {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  R apply(float first, float second);
}
