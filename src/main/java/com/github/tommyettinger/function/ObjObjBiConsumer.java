package com.github.tommyettinger.function;

/**
 * Represents an operation that accepts
 * two input arguments with potentially different types and returns no result.
 * <br>
 * This is identical to {@code BiConsumer} in Java 8, and is present here so environments
 * that support lambdas but not Java 8 APIs (such as RoboVM) can use it.
 * <br>
 * This is a functional interface
 * whose functional method is {@link #accept(Object, Object)}.
 */
@FunctionalInterface
public interface ObjObjBiConsumer<T, U> {
    /**
     * Performs this operation on the given arguments.
     *
     * @param t the first input argument
     * @param u the second input argument
     */
    void accept(T t, U u);
}
