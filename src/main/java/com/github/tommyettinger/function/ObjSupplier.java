package com.github.tommyettinger.function;

/**
 * Represents a supplier of {@code R}-valued results.
 * <br>
 * This is identical to {@code Supplier} in Java 8, and is present here so environments
 * that support lambdas but not Java 8 APIs (such as RoboVM) can use it.
 * <br>
 * This is a functional interface whose functional method is {@link #get()}.
 */
@FunctionalInterface
public interface ObjSupplier<R> {
  /**
   * Gets a result.
   *
   * @return a result
   */
  R get();
}
