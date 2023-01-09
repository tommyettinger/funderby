package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code T}-valued operand and a {@code U}-valued
 * operand that produces a {@code float}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsFloat(Object, Object)}.
 */
@FunctionalInterface
public interface ObjObjToFloatBiFunction<T, U> {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  float applyAsFloat(T first, U second);
}
