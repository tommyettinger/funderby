package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code char}-valued operand and a {@code T}-valued
 * operand that produces a {@code char}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsChar(char, T)}.
 */
@FunctionalInterface
public interface CharObjToCharBiFunction<T> {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  char applyAsChar(char first, T second);
}
