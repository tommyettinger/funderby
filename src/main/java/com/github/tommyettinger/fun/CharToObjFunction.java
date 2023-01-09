package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code char}-valued operand that produces
 * a {@code R}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #apply(char)}.
 */
@FunctionalInterface
public interface CharToObjFunction<R> {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  R apply(char value);
}
