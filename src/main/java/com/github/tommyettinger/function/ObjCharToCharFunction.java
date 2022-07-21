package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code T}-valued operand and a {@code char}-valued
 * operand that produces a {@code char}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsChar(Object, char)}.
 */
@FunctionalInterface
public interface ObjCharToCharFunction<T> {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  char applyAsChar(T first, char second);
}
