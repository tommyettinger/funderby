package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code short}-valued operand and a {@code T}-valued
 * operand that produces a {@code R}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #apply(short, Object)}.
 */
@FunctionalInterface
public interface ShortObjToObjBiFunction<T, R> {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  R apply(short first, T second);
}
