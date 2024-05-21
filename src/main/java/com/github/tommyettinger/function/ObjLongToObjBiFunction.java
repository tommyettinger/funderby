package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code T}-valued operand and a {@code long}-valued
 * operand that produces a {@code R}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #apply(T, long)}.
 */
@FunctionalInterface
public interface ObjLongToObjBiFunction<T, R> {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  R apply(T first, long second);
}
