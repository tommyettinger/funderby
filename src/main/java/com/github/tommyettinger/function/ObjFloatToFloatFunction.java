package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code T}-valued operand and a {@code float}-valued
 * operand that produces a {@code float}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsFloat(Object, float)}.
 */
@FunctionalInterface
public interface ObjFloatToFloatFunction<T> {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  float applyAsFloat(T first, float second);
}
