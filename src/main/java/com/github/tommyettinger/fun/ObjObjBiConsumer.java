package com.github.tommyettinger.fun;

import java.util.function.BiConsumer;

/**
 * Represents an operation that accepts
 * two input arguments and returns no result.
 * <br>
 * This is a functional interface
 * whose functional method is {@link #accept(Object, Object)}.
 */
@FunctionalInterface
public interface ObjObjBiConsumer<T, U> extends BiConsumer<T, U> {
}
