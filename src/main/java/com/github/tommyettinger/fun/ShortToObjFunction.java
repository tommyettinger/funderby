package com.github.tommyettinger.fun;

/**
 * Represents an operation on a single {@code short}-valued operand that produces
 * a {@code R}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #apply(short)}.
 */
@FunctionalInterface
public interface ShortToObjFunction<R> {
  /**
   * Applies this fun to the given argument.
   *
   * @param value the fun argument
   * @return the fun result
   */
  R apply(short value);
}
