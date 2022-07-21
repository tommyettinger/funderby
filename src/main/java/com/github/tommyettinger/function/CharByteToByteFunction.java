package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code char}-valued operand and a {@code byte}-valued
 * operand that produces a {@code byte}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsByte(char, byte)}.
 */
@FunctionalInterface
public interface CharByteToByteFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  byte applyAsByte(char first, byte second);
}
