package com.github.tommyettinger.function;

import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeVariableName;

import java.util.LinkedHashMap;

import static com.squareup.javapoet.TypeName.*;

public class GeneratorCommon {
    /**
     * Makes a LinkedHashMap with key and value types inferred from the types of k0 and v0, and considers all
     * parameters key-value pairs, casting the Objects at positions 0, 2, 4... etc. to K and the objects at positions
     * 1, 3, 5... etc. to V. If rest has an odd-number length, then it discards the last item. If any pair of items in
     * rest cannot be cast to the correct type of K or V, then this inserts nothing for that pair.
     * @param k0 the first key; used to infer the types of other keys if generic parameters aren't specified.
     * @param v0 the first value; used to infer the types of other values if generic parameters aren't specified.
     * @param rest an array or vararg of keys and values in pairs; should contain alternating K, V, K, V... elements
     * @param <K> the type of keys in the returned LinkedHashMap; if not specified, will be inferred from k0
     * @param <V> the type of values in the returned LinkedHashMap; if not specified, will be inferred from v0
     * @return a freshly-made LinkedHashMap with K keys and V values, using k0, v0, and the contents of rest to fill it
     */
    @SuppressWarnings("unchecked")
    public static <K, V> LinkedHashMap<K, V> map(K k0, V v0, Object... rest)
    {
        if(rest == null || rest.length == 0)
        {
            LinkedHashMap<K, V> lhm = new LinkedHashMap<>(2);
            lhm.put(k0, v0);
            return lhm;
        }
        LinkedHashMap<K, V> lhm = new LinkedHashMap<>(1 + (rest.length / 2));
        lhm.put(k0, v0);

        for (int i = 0; i < rest.length - 1; i+=2) {
            try {
                lhm.put((K) rest[i], (V) rest[i + 1]);
            }catch (ClassCastException ignored) {
            }
        }
        return lhm;
    }

    public static final TypeName[] TYPES = {
            BOOLEAN,
            BYTE,
            CHAR,
            DOUBLE,
            FLOAT,
            INT,
            LONG,
            SHORT,
            OBJECT
    };

    public static final LinkedHashMap<TypeName, String> TITLE_NAMES = map(
            BOOLEAN, "Boolean",
            BYTE,    "Byte",
            CHAR,    "Char",
            DOUBLE,  "Double",
            FLOAT,   "Float",
            INT,     "Int",
            LONG,    "Long",
            SHORT,   "Short",
            OBJECT,  "Object");

    public static final LinkedHashMap<TypeName, String> RETURN_NAMES = map(
            BOOLEAN, "applyAsBoolean",
            BYTE,    "applyAsByte",
            CHAR,    "applyAsChar",
            DOUBLE,  "applyAsDouble",
            FLOAT,   "applyAsFloat",
            INT,     "applyAsInt",
            LONG,    "applyAsLong",
            SHORT,   "applyAsShort",
            OBJECT,  "apply");

    public static final LinkedHashMap<TypeName, String> CODE_NAMES = map(
            BOOLEAN, "boolean",
            BYTE,    "byte",
            CHAR,    "char",
            DOUBLE,  "double",
            FLOAT,   "float",
            INT,     "int",
            LONG,    "long",
            SHORT,   "short",
            OBJECT,  "Object");
}
