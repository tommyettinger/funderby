package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code int}-valued operand and a {@code T}-valued
 * operand that produces a {@code int}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsInt(int, T)}.
 */
@FunctionalInterface
public interface IntObjToIntBiFunction<T> {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  int applyAsInt(int first, T second);
}
