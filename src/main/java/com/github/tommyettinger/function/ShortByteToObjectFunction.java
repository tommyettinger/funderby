/*
 * Copyright (c) 2022 Goldman Sachs and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompany this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 */

package com.github.tommyettinger.function;

/**
 * A ShortByteToObjectFunction is a two argument lambda or closure which takes a primitive short as the first and
 * a primitive byte as the second argument and returns an Object as the result.
 * This file was automatically generated from template file primitivePrimitiveToObjectFunction.stg.
 *
 * @since 9.0.
 */
@FunctionalInterface
public interface ShortByteToObjectFunction<T>
{
    T value(short argument1, byte argument2);
}
