package com.github.tommyettinger.function;

/**
 * Represents a supplier of {@code char}-valued results.
 * <br>
 * This is a functional interface whose functional method is {@link #getAsChar()}.
 */
@FunctionalInterface
public interface CharSupplier {
  /**
   * Gets a result.
   *
   * @return a result
   */
  char getAsChar();
}
