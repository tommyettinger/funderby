package com.github.tommyettinger.function;

/**
 * Represents a supplier of {@code long}-valued results.
 * <br>
 * This is identical to {@code LongSupplier} in Java 8, and is present here so environments
 * that support lambdas but not Java 8 APIs (such as RoboVM) can use it.
 * <br>
 * This is a functional interface whose functional method is {@link #getAsLong()}.
 */
@FunctionalInterface
public interface LongSupplier {
  /**
   * Gets a result.
   *
   * @return a result
   */
  long getAsLong();
}
