package Chapter1._0_Start;
/*
This is a CLASS. A CLASS is a blueprint for generating an OBJECT. Classes contain states (variables) and
behavior (methods).

The public keyword here is one of the access modifiers. The access modifier affects if the class, variable,
or method is visible outside of this class: for instance, if we used the private keyword rather than public,
our testing class wouldn't have access, and we wouldn't be able to instantiate a Guide object or call the
guideMethod method.
*/
public class Guide {
    /*
    This is a variable. Currently it is SCOPED to the entire object, so it can be accessed
    by any of its methods. It is an int, one of our primitive type (most basic form
    of information, like characters or booleans). Its are whole numbers. We have assigned it the name id.
     */
    int id;
    /*
    This is a CONSTRUCTOR. When we instantiate a method, a constructor is called.
    Usually a constructor is used to define an object's fields.
    A default constructor, with no arguments and with no behavior, can be called if none
    other is written (this is how all the other problems in this repo work.)
     */
    public Guide(int id){
        this.id = id;
    }
    /*
    This is a METHOD. A method is a reusable block of code that belongs to a specific object.
    For every method other than constructors, we must define a return type: here this is String,
    so we must return something that is a String. If we do not wish to return anything, we could
    set the return type to void.
    Following the name of the method, we have any parameters of our method (in this case, String method).
    A parameter is a variable that is 'passed in' by whatever class has called this method - so, we can use
    this to give an individual behavior to every method call, like changing the returned message,
    in addition to any individual behavior that is related to the object owning the method (returning
    this guide object's id.
     */
    public String guideMethod(String message){
        /*
        Strings are special types of Objects that are stored and instantiated differently.
        If you ctrl+click on "String", you can see that the relationship between the String class and
        the String object is the same as the relationship between the Guide class and the Guide object.
         */
        return "Success from guide object "+ id+"! it says: " + message ;
    }
    /*
    Now, locate the test class and run its test. It should pass.
    Now your task will be modifying the code in the remainder of the repo so that their test cases pass rather
    than fail.
     */
}
