/*
 * Copyright (c) 2022 Goldman Sachs.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompany this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 */

package com.github.tommyettinger.fun;

/**
 * BytePredicate is a primitive Predicate which may be used to reduce the overhead
 * of autoboxing Byte objects in places where primitive bytes could be used.
 */
@FunctionalInterface
public interface BytePredicate {
    boolean test(byte value);
}
