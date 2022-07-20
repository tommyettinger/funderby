package com.github.tommyettinger.function;

/**
 * Represents an operation on a single {@code T}-valued operand that produces
 * a {@code byte}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsByte(Object)}.
 */
@FunctionalInterface
public interface ObjToByteFunction<T> {
  /**
   * Applies this function to the given argument.
   *
   * @param value the function argument
   * @return the function result
   */
  byte applyAsByte(T value);
}
