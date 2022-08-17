package Chapter4._0_OOP.ObjectMethods.ToString;
/*
A toString method should contain some useful information about the object. A toString is useful for printing/logging
information about an object. toString comes with all objects, it is derived from the parent object class,
but by default it is not very useful. So, we must override the inherited method.
The test cases here will only check if the toString contains information about the fields of this object. The string may
be formatted in any way.
 */
public class ImplementToStringMethod {
    int a;
    int b;
    boolean c;

    public ImplementToStringMethod(int a, int b, boolean c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
