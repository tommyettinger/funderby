package com.github.tommyettinger.fun;

/**
 * Represents a supplier of {@code short}-valued results.
 * <br>
 * This is a functional interface whose functional method is {@link #getAsShort()}.
 */
@FunctionalInterface
public interface ShortSupplier {
  /**
   * Gets a result.
   *
   * @return a result
   */
  short getAsShort();
}
