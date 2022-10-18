# OOP

Our first introduction to objects should be explaining why we use them, as although OOP is a common feature of many
programming languages, there is a reason to (or not to) use it.

Objects contain states (its own internal variables) and behavior (its methods). We write classes to define these
(classes are the blueprints for objects - classes are the files that we write, and objects are what's generated when
the program actually runs.)

Objects are instances of Classes. The process of generating a new Object is called instantiation. When we instantiate a new Object, we actually need to call a special method called a constructor. A constructor has no return type and is named after its class, it's used to set up a new object. For example, in the line `Scanner in = new Scanner(System.in)`, we are create a new object called in based off of the Scanner class. Scanner(System.in) is actually a method (the constructor).

The convenient thing about objects is that their behavior can be designed to change based off of what values it stores. For example, a Scanner can have differing behavior depending on what form of input it will receive, such as different files or user inputs.

OOP hasn't always been around. Prior to OOP, the main programming paradigm was called functional programming - without objects, people would write long functions (same as methods) that generated differing output for particular inputs. As applications grew larger, this became cumbersome and difficult to debug and test. OOP makes this more elegant and encourages reusing the same functionality. 
* You can simulate functional programming in Java by marking all of your variables and methods with the static keyword, which allows us to use them without instantiating any objects. Static variables and methods are tied to the existence of a class rather than an object.