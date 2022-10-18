package Chapter4._0_OOP.Interfaces;

/**
 * Notice that we are IMPLEMENTING the comparable interface, for type of ObjectToBeCompared.
 * This means that we must implement compareTo, otherwise the code will not compile.
 *
 * We leverage compareTo because we may need to guarantee that an object is mutually understood as exhibiting
 * Comparable behavior if we are heavily leveraging OOP and generics. If we are creating a data structure that can
 * store any type of object, but must also sort them, we must guarantee that the objects are capable
 * of being sorted and provide a mutually understood method to compare them - compareTo.
 */

public class ObjectToBeCompared implements Comparable<ObjectToBeCompared>{
    int val;

    /**
     * No need to change this object's constructor - it will be used in the tests.
     * @param val A value stored in ObjectToBeCompared which will be used in the comparison process.
     */
    public ObjectToBeCompared(int val){
        this.val = val;
    }

    /**
     * CompareTo should return a negative value if the object's 'val' is less than another object's 'val',
     * and positive otherwise. If 'val' is equal for both objects, return 0.
     */
    public int compareTo(ObjectToBeCompared o) {
        return 0;
    }

}
