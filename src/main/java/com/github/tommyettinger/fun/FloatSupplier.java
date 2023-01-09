package com.github.tommyettinger.fun;

/**
 * Represents a supplier of {@code float}-valued results.
 * <br>
 * This is a functional interface whose functional method is {@link #getAsFloat()}.
 */
@FunctionalInterface
public interface FloatSupplier {
  /**
   * Gets a result.
   *
   * @return a result
   */
  float getAsFloat();
}
