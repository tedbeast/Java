package Chapter4._0_OOP.ParentObjectClassMethods.ToString;

/**
 * A toString method should contain some useful information about the object. A toString is useful for printing/logging
 * information about an object.
 *
 * Like equals, all Objects inherit toString from the parent Object class, by default it is not very useful (you may
 * have seen the default implementation before if you tried to print an object and got random letters and numbers.)
 * So, we must override the inherited method by writing a toString method in this class.
 *
 * The test cases here will check if the toString contains information about the fields of this object. The string may
 * be formatted in any way.
 *
 * In the future, your IDE should have a way to automatically generate constructors, getters, setters, equals, and
 * toString. In Intellij, you can find this meny by either right clicking and locating 'generate' or pressing
 * alt+insert.
 */
public class ImplementToStringMethod {
    int a;
    int b;
    boolean c;

    /**
     * No need to touch this constructor - it is used for the purpose of the test.
     * @param a
     * @param b
     * @param c
     */
    public ImplementToStringMethod(int a, int b, boolean c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
