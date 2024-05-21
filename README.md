# funderby

Java 8+ functional interfaces for primitive types.

## What is it?

Funderby provides over 400 functional interfaces, mostly specialized for primitive types
that aren't supported by the standard `java.util.function` interfaces. There are:

  - Suppliers that return primitive types,
  - Single-argument and dual-argument Predicates,
  - Single-argument and dual-argument Consumers and BiConsumers,
  - Single-argument Functions that return possibly a different type,
  - Dual-argument BiFunctions that could
    - Take two arguments with one type and return possibly a different type, or that
    - Take two arguments of different types and return the first type, or
    - Take two arguments of different types and return the second type.

Most of these use a consistent naming format.

  - `$TYPE0` `Predicate` takes a $TYPE0 and returns a boolean.
    - If a functional interface returns `boolean` here, it is always a `Predicate`. 
  - `$TYPE0` `$TYPE1` `Predicate` takes a $TYPE0 and a $TYPE1 and returns a boolean.
  - `$TYPE0` `Supplier` returns a $TYPE0.
  - `$TYPE0` `Consumer` takes a $TYPE0.
  - `$TYPE0` `$TYPE1` `BiConsumer` takes a $TYPE0 and a $TYPE1.
  - `$TYPE0` `To` `$TYPE1` `Function` takes a $TYPE0 and returns a $TYPE1.
  - `$TYPE0` `$TYPE1` `To` `$TYPE2` `BiFunction` takes a $TYPE0 and a $TYPE1 and returns a $TYPE2.
    - In version 0.1.1 and earlier, $TYPE1 and $TYPE2 are always the same (if primitive) or both Object types.
    - Starting in version 0.1.2, more types are available, allowing $TYPE2 to instead be the same as $TYPE0.

Types can be `Boolean`, `Byte`, `Char`, `Double`, `Float`, `Int`, `Long`, `Short`, or `Obj`
(meaning Object, and always a generic type). Two exceptions are `ObjToSameFunction` and
`ObjSameBiConsumer`, which only take one generic type parameter because what would be different
generic type parameters are the same there. Some functional interfaces are not really necessary
because the JDK already provides one with the same name and signature; this library provides
duplicates so that platforms like RoboVM can still have functional interface types. On RoboVM,
you can use lambdas and have them assignable to interfaces like `ObjToObjFunction`, which is
roughly equivalent to `java.util.function.Function`.

## Why?

I found myself redefining primitive-based functional interfaces fairly often, so I decided to
bite the bullet and make as many functional interfaces as I could. Eclipse-Collections does a
lot of this work, but it also changes some names in what to me is a counterintuitive way. It
also uses `java.io.Serializable`, and we don't here.

## How to Get It?

Via Gradle,

```groovy
api "com.github.tommyettinger:funderby:0.1.2"
```

If you use GWT, you also need

```groovy
api "com.github.tommyettinger:funderby:0.1.2:sources"
```

And in your main .gwt.xml file,

```
<inherits name="com.github.tommyettinger.funderby" />
```

If you use Maven, the dependency is:

```
<dependency>
  <groupId>com.github.tommyettinger</groupId>
  <artifactId>funderby</artifactId>
  <version>0.1.2</version>
</dependency>
```

With this required if you use GWT, plus the above .gwt.xml line:

```
<dependency>
  <groupId>com.github.tommyettinger</groupId>
  <artifactId>funderby</artifactId>
  <version>0.1.2</version>
  <classifier>sources</classifier>
</dependency>
```

## License

Versions 0.1.1 and earlier are licensed under the same license as Eclipse-Collections, the EPL v 1.0 and the EDL v 1.0 .

Versions 0.1.2 and any subsequent versions are licensed under the Apache License, version 2.0 .

The EPL was only chosen because a pre-alpha version was considering copying over interfaces from Eclipse Collections,
but that turned out not to be the route this library took. Since nearly all of the related code (that is most likely to
use this library) is Apache-licensed, using the same license as those makes sense.

## Trivia

The name comes from the MLB Home Run Derby, which was happening when I was starting to
make this library. It also includes "fun" for functional interface.

No, it is not "fun" for "I had a fun time making this." The only fun part was how easy
[JavaPoet](https://github.com/square/javapoet) was to work with; JavaPoet was used to
generate the many functional interfaces from template-like code.
