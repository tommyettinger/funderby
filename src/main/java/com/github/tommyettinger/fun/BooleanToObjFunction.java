package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code boolean}-valued operand that produces
 * a {@code R}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #apply(boolean)}.
 */
@FunctionalInterface
public interface BooleanToObjFunction<R> {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  R apply(boolean value);
}
