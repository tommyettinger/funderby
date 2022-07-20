package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code short}-valued operand that produces
 * a {@code R}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #apply(short)}.
 */
@FunctionalInterface
public interface ShortToObjectFunction<R> {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  R apply(short value);
}
