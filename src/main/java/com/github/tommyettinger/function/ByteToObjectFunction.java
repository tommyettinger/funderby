package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code byte}-valued operand that produces
 * a {@code R}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #apply(byte)}.
 */
@FunctionalInterface
public interface ByteToObjectFunction<R> {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  R apply(byte value);
}
