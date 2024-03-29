package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code boolean}-valued operand and a {@code boolean}-valued
 * operand that produces a {@code R}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #apply(boolean, boolean)}.
 */
@FunctionalInterface
public interface BooleanBooleanToObjBiFunction<R> {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  R apply(boolean first, boolean second);
}
