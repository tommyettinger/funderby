package com.github.tommyettinger.function;

import java.util.function.ToDoubleBiFunction;

/**
 * Represents an operation on a {@code T}-valued operand and a {@code U}-valued
 * operand that produces a {@code double}-valued result.
 * <br>
 * This is a functional interface whose functional method is {@link #applyAsDouble(Object, Object)}.
 */
@FunctionalInterface
public interface ObjObjToDoubleBiFunction<T, U> extends ToDoubleBiFunction<T, U> {
}
