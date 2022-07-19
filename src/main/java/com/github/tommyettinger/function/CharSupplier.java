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

/**
 * CharSupplier is a zero argument lambda.  It can be stored in a variable or passed as a parameter and executed
 * by calling the value method. It may be used to reduce the overhead
 * of autoboxing Character objects in places where primitive chars could be used.
 * This file was automatically generated from template file primitiveSupplier.stg.
 *
 * @since 3.0.
 */
@FunctionalInterface
public interface CharSupplier
{
    char getAsChar();
}
