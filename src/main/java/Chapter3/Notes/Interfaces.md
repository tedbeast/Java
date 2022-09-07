# Interfaces

You may have noticed that this code is impossible to write:

```
List<String> list = new List<>();
```
but this one is allowed:
``` 
List<String> list = new ArrayList<>();
```

Why? This seems to break the convention that we have established with constructors.

List here is actually not a class. List is an interface. Interfaces define the potential behavior of a class, but they do not have any functionality of their own. It is the task of classes using the `implements` keyword to provide functionality for all methods defined by the interface.

Interfaces have a few uses, but to start off, they are a good organizational tool. There are multiple valid ways we could write an implementation of things a list could do, but that presupposes a general architecture of list behavior (add items, get items, etc.)