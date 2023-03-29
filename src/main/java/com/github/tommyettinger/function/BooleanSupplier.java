package com.github.tommyettinger.function;

/**
 * Represents a supplier of {@code boolean}-valued results.
 * <br>
 * This is identical to {@code BooleanSupplier} in Java 8, and is present here so environments
 * that support lambdas but not Java 8 APIs (such as RoboVM) can use it.
 * <br>
 * This is a functional interface whose functional method is {@link #getAsBoolean()}.
 */
@FunctionalInterface
public interface BooleanSupplier {
  /**
   * Gets a result.
   *
   * @return a result
   */
  boolean getAsBoolean();
}
