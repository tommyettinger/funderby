package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code T}-valued operand and a {@code U}-valued
 * operand that produces a {@code long}-valued result.
 * <br>
 * This is identical to {@code ToLongBiFunction} in Java 8, and is present here so environments
 * that support lambdas but not Java 8 APIs (such as RoboVM) can use it.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsLong(Object, Object)}.
 */
@FunctionalInterface
public interface ObjObjToLongBiFunction<T, U> {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  long applyAsLong(T first, U second);
}
