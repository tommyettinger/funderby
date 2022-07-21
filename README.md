# funderby

Java 8+ functional interfaces for primitive types, partly based on Eclipse-Collections.

## What is it?

Funderby provides nearly 400 functional interfaces, mostly specialized for primitive types
that aren't supported by the standard `java.util.function` interfaces. There are:

  - Suppliers that return primitive types,
  - Single-argument Predicates,
  - Single-argument and dual-argument Consumers and BiConsumers,
  - Single-argument Functions that return possibly a different type,
  - Dual-argument BiFunctions that either
    - Take two arguments with one type and return possibly a different type, or that
    - Take two arguments of different types and return the second type.

Most of these use a consistent naming format.

  - `$TYPE0` `Predicate` takes a $TYPE0 and returns a boolean.
    - If a functional interface returns `boolean` here, it is always a `Predicate`. 
  - `$TYPE0` `Supplier` returns a $TYPE0.
  - `$TYPE0` `Consumer` takes a $TYPE0.
  - `$TYPE0` `$TYPE1` `BiConsumer` takes a $TYPE0 and a $TYPE1.
  - `$TYPE0` `To` `$TYPE1` `Function` takes a $TYPE0 and returns a $TYPE1.
  - `$TYPE0` `$TYPE1` `To` `$TYPE2` `BiFunction` takes a $TYPE0 and a $TYPE1 and returns a $TYPE2.

Types can be `Boolean`, `Byte`, `Char`, `Double`, `Float`, `Int`, `Long`, `Short`, or `Obj`
(meaning Object, and always a generic type). One exception is `ObjToSameFunction`, which simply
extends `UnaryOperator` from the JDK because we don't use the term Operator here (you still can,
though). Some functional interfaces are not really necessary because the JDK already provides
one with the same name and signature; you should check `java.util.function` first before using
one of the interfaces here.

## Why?

I found myself redefining primitive-based functional interfaces fairly often, so I decided to
bite the bullet and make as many functional interfaces as I could. Eclipse-Collections does a
lot of this work, but it also changes some names in what to me is a counterintuitive way. It
also uses `java.io.Serializable` without a clear reason to do so, and I feel like Serializable
is a ticking time bomb in actual use.

## How to Get It?

Via Gradle,

```groovy
api "com.github.tommyettinger:funderby:0.0.1"
```

If you use GWT, you also need

```groovy
api "com.github.tommyettinger:funderby:0.0.1:sources"
```

And in your main .gwt.xml file,

```
<inherits name="funderby" />
```

If you use Maven, the dependency is:

```
<dependency>
  <groupId>com.github.tommyettinger</groupId>
  <artifactId>funderby</artifactId>
  <version>0.0.1</version>
</dependency>
```

With this required if you use GWT, plus the above .gwt.xml line:

```
<dependency>
  <groupId>com.github.tommyettinger</groupId>
  <artifactId>funderby</artifactId>
  <version>0.0.1</version>
  <classifier>sources</classifier>
</dependency>
```

## License

Licensed under the same license as Eclipse-Collections, the EPL v 1.0 and the EDL v 1.0 .

## Trivia

The name comes from the MLB Home Run Derby, which was happening when I was starting to
make this library. It also includes "fun" for functional interface.

No, it is not "fun" for "I had a fun time making this." The only fun part was how easy
[JavaPoet](https://github.com/square/javapoet) was to work with; JavaPoet was used to
generate the many functional interfaces from template-like code.
