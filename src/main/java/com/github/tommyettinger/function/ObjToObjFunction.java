package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code T}-valued operand that produces
 * an {@code R}-valued result.
 * <br>
 * This is identical to {@code Function} in Java 8, and is present here so environments
 * that support lambdas but not Java 8 APIs (such as RoboVM) can use it.
 * <br>
 * This is a functional interface whose functional method is {@link #apply(Object)}.
 */
@FunctionalInterface
public interface ObjToObjFunction<T, R> {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  R apply(T value);
}
