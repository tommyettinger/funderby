package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code short}-valued operand that produces
 * a {@code char}-valued result.
 *
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsChar(short)}.
 */
@FunctionalInterface
public interface ShortToCharFunction {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  char applyAsChar(short value);
}
