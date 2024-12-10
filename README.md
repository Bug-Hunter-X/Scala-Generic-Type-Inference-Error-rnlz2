# Scala Generic Type Inference and println Issue

This repository demonstrates a common issue encountered when working with generic types in Scala.  Specifically, it highlights challenges that arise when a generic type parameter is used in a method that relies on methods specific to certain types (like println). The code tries to use a generic class `MyClass` with various types, but faces an error with types that don't have compatible println methods.

The goal of this repository is to illustrate the problem and provide a solution to manage cases with different types and handle potential errors gracefully.
