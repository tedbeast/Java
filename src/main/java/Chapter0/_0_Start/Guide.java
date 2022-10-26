package Chapter0._0_Start;

/**
 * This is a CLASS. A CLASS is a blueprint for generating an OBJECT. Objects contain states (variables) and
 * behavior (methods).
 *
 * The public keyword here is one of the access modifiers. The access modifier affects if the class, variable,
 * or method is visible outside of this class. Public is used here to designate this class as accessible across the
 * entire application.
 */
public class Guide {
    /**
     *
     * This is a variable. Currently it is scoped to the entire object, so it can be accessed
     * by any of its methods. It is an int, one of our primitive types (most basic form
     * of information, like characters or booleans). Its are whole numbers. We have assigned it
     * the name id, since we could use this variable to tell different Guide objects apart.
     *
     */
    int id;

    /**
     * This is a CONSTRUCTOR. Whenever we instantiate an object, a constructor is called.
     * Usually a constructor is used to define an object's fields.
     * A default constructor, with no arguments and with no behavior, can be called if none
     * other is written (this is how all the other problems in this repo work.)
     *
     * example usage: Guide guideObject1 = new Guide(1);
     *
     * @param id We'll be setting the id of this object to whatever is passed in as a parameter
     *           to the constructor.
     */
    public Guide(int id){
        this.id = id;
    }
    /**
     *  This is a METHOD. A method is a reusable block of code that belongs to a specific object.
     *  For every method other than constructors, we must define a return type: here this is String,
     *  so we must return something that is a String (Strings are just text.) If we do not wish to
     *  return anything, we could set the return type to void.
     *
     *  example usage: guideObject1.guideMethod("hello"); returns "Success from guide object 1! it says: hello"
     *
     * @param message a message variable, which will be a variable of type String. This method
     *                will use the message variable as part of the text that is returned by this method. A
     *                return can send data back to the part of the code which called this method.
     *
     * @return  some text that informs us about the guide object's id, as well as the message that was
     *          passed into this method.
     */
    public String guideMethod(String message){
        return "Success from guide object "+ id+"! it says: " + message ;
    }
    /**
     *  Now, locate the test class and run its test. It should pass, revealing green checkmarks in your run window.
     *  Your task will be modifying the code in the remainder of the repo so that their test cases pass rather
     *  than fail.
     */
}
