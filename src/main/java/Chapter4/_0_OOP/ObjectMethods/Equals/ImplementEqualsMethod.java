package Chapter4._0_OOP.ObjectMethods.Equals;

/*
we will need to compare this object to other objects of the same type, so we will need to implement
a .equals() method ourselves.
we can not use ==. == is a 'shallow' comparison, it doesn't compare the fields of objects, it only checks
if two memory references are equal.
The .equals() method we inherit from the Object class just does a shallow comparison, so we should override it with our
own method.
 */
public class ImplementEqualsMethod {
    int a;
    int b;
    boolean c;

    public ImplementEqualsMethod(int a, int b, boolean c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

}
