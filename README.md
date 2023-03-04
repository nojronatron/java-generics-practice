# GenericsPractice Project

Following the Oracle Java Docs [Q and E](https://docs.oracle.com/javase/tutorial/java/generics/QandE/generics-questions.html), create code and tests that will validate learnings and answer ending Quiz questions.

## Takeaways

- An array is denoted by `[]` following a Type, which can be any primitive or Class: `Integer[] india = {1,2,3,}` is functionally similar to `int[] india = {1,2,3,}` but probably takes more memory storage.
- The Java class Arrays is a functional class that help work with Array types and Lists.
- The Java class Array has static methods used to create and access Java arrays.
- `List<E>` is a Collection Interface that extends `Iterable<E>`. Brackets `[]` array does not have these interface features.
- `ArrayList<E>` implements `List<E>` and is a fully instantiatable Class. Should not be confused with brackets `[]` arrays.
- Generic functions do *not* require a containing class to be generic! Use `public static <T> void setMethod(){}` to set the method with a generic type placeholder.
- Leveraging wildcard `?` can be tricky due to inheritance, and there are situations where using it will cause problems during run time.

## Resources

Oracle's [Java Tutorials](https://docs.oracle.com/javase/tutorial/java/generics/index.html)

Baeldung: [Java Generics](https://www.baeldung.com/java-generics)

Baeldung: [Comparing Objects in Java](https://www.baeldung.com/java-comparing-objects)
