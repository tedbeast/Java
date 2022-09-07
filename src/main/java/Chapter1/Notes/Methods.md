What's a method, and what is its structure?

In Java, all code must be written in a method. A method is a reusable block of code that we can name and reuse at any time by calling its name. A method is tied to a particular class.

Methods have parameters (sometimes referred to as arguments) and return types.

If we take into account this method named returnHelloNumber:

```
public String returnHelloNumber(int n){
    return ("Hello " + n);
}
```

String is the return type. This means that we MUST return a variable of the type String. The only case where we do not return anything is in the return type void.

We also have, within the parentheses after returnHelloNumber, and int n. This is a parameter, which is a variable that can be used anywhere within the method. A parameter is "passed in" by whatever entity called the method, that method would look something like this:

```
String result = returnHelloNumber(0);
```

Parameters give methods behavior that may change depending on what values we give it; in this case we would receive the String "Hello 0". Returning a value here will load "Hello 0" into the String result.

There is also a special type of method called the main method, which looks something like this:

```
public static void main(String[] args){

}
```
This is a method that Java recognizes as the starting point for running a program.
