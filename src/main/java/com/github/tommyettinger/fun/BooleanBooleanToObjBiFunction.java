package com.github.tommyettinger.fun;

/**
 * Represents an operation on a {@code boolean}-valued operand and a {@code boolean}-valued
 * operand that produces a {@code R}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #apply(boolean, boolean)}.
 */
@FunctionalInterface
public interface BooleanBooleanToObjBiFunction<R> {
  /**
   * Applies this fun to the given arguments.
   *
   * @param first the first fun argument
   * @param second the second fun argument
   * @return the fun result
   */
  R apply(boolean first, boolean second);
}
