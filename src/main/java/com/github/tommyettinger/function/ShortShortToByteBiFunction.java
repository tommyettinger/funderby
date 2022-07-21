package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code short}-valued operand and a {@code short}-valued
 * operand that produces a {@code byte}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsByte(short, short)}.
 */
@FunctionalInterface
public interface ShortShortToByteBiFunction {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  byte applyAsByte(short first, short second);
}
