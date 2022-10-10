package Chapter4._0_OOP.ParentObjectClassMethods.Equals;

/**
 * The test cases for this class use a method called .equals which isn't written anywhere in this class. How?
 * All objects have a method called .equals() - it is inherited from the Object class, which is actually the parent
 * class of all Java classes.
 *
 * When we inherit .equals, we inherit a method that isn't very useful - however, we could override the .equals method
 * so that the .equals method we write in this class is used instead! This overriding falls under the OOP principle
 * of polymorphism, specifically runtime polymorphism. Overriding equals will be the task for this challenge:
 * two objects will be considered equal if a, b, and c are equal in both objects. .equals should take in a parameter
 * that is another ImplementEqualsMethod object, and access its version of a, b, and c.
 *
 * Why can't we just use ==? == is referred to as a shallow comparison - it only compares the 'address' of an
 * object in memory. Two objects can have equivalent values of a,b, and c but == could resolve to false because the
 * equivalent object is located in a different place in memory. == will resolve to true if two variables represent
 * literally the same object in memory.
 */
public class ImplementEqualsMethod {
    int a;
    int b;
    boolean c;

    /**
     * No need to touch this constructor - it is used for the purpose of the test.
     * @param a
     * @param b
     * @param c
     */
    public ImplementEqualsMethod(int a, int b, boolean c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

}
