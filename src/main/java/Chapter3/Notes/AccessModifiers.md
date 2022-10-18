There are four access modifiers in Java. You're unlikely to run into
modifiers other than public and private in everyday code, but here is a general guideline:

All variables can be accessed within their own class. 

Only public modifiers can be accessed anywhere within the java application.

Protected, default, and private can not be accessed from outside of the class's package.

Default and private modifiers can not be accessed by subclasses (classes that inherit from this class.)

Private modifiers can not even be accessed within their class's package. Private modifiers are exclusive to just their containing class.
```
Modifier    | Class | Package | Subclass | World

public      |  Y    |    Y    |    Y     |   Y

protected   |  Y    |    Y    |    Y     |   N

default     |  Y    |    Y    |    N     |   N

private     |  Y    |    N    |    N     |   N