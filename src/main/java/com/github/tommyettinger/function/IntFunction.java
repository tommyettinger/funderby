/*
 * Copyright (c) 2022 Goldman Sachs.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompany this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 */

package com.github.tommyettinger.function;

import java.io.Serializable;

/**
 * IntFunction is a primitive Function which may be used to reduce the overhead
 * of autoboxing Integer objects in places where primitive ints could be used.
 * This file was automatically generated from template file primitiveFunction.stg.
 *
 * @since 3.0.
 */
@FunctionalInterface
public interface IntFunction<T>
        extends java.util.function.ToIntFunction<T>, Serializable
{
    int intValueOf(T anObject);

    @Override
    default int applyAsInt(T value)
    {
        return this.intValueOf(value);
    }
}
