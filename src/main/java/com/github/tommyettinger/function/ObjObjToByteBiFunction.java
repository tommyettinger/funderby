package com.github.tommyettinger.function;

/**
 * Represents an operation on a {@code T}-valued operand and a {@code U}-valued
 * operand that produces a {@code byte}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsByte(Object, Object)}.
 */
@FunctionalInterface
public interface ObjObjToByteBiFunction<T, U> {
  /**
   * Applies this function to the given arguments.
   *
   * @param first the first function argument
   * @param second the second function argument
   * @return the function result
   */
  byte applyAsByte(T first, U second);
}
