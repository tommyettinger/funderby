package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code boolean}-valued operand that produces
 * a {@code R}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #apply(boolean)}.
 */
@FunctionalInterface
public interface BooleanToObjFunction<R> {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  R apply(boolean value);
}
