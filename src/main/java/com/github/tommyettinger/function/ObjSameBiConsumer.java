package com.github.tommyettinger.function;

/**
 * Represents an operation that accepts
 * two input arguments with the same type and returns no result.
 * <br>
 * This is a functional interface
 * whose functional method is {@link #accept(Object, Object)}.
 */
@FunctionalInterface
public interface ObjSameBiConsumer<T> extends ObjObjBiConsumer<T, T> {
}
