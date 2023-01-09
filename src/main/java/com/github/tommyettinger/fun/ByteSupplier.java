package com.github.tommyettinger.fun;

/**
 * Represents a supplier of {@code byte}-valued results.
 * <br>
 * This is a functional interface whose functional method is {@link #getAsByte()}.
 */
@FunctionalInterface
public interface ByteSupplier {
  /**
   * Gets a result.
   *
   * @return a result
   */
  byte getAsByte();
}
