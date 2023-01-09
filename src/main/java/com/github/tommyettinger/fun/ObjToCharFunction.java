package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code T}-valued operand that produces
 * a {@code char}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsChar(Object)}.
 */
@FunctionalInterface
public interface ObjToCharFunction<T> {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  char applyAsChar(T value);
}
