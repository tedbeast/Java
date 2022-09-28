package Chapter5._0_OOP.Interfaces;

/*
notice that we are IMPLEMENTING the comparable interface, for type of ComparableObject.
This means that we must implement compareTo, otherwise the code will not compile.
CompareTo should return a negative value if the object's 'val' is less than another object's 'val', and positive otherwise.

The reason why we need to leverage compareTo in this case is because sometimes we need to guarantee that an object
is a Comparable if we are heavily leveraging OOP and generics. If we are creating a data structure that can
take hypothetically any type of object, but must also sort them, we need to guarantee that the objects are capable
of being sorted and provide a mutually understood method to compare them.
 */

public class ObjectToBeCompared implements Comparable<ObjectToBeCompared>{
    int val;

    public ObjectToBeCompared(int val){
        this.val = val;
    }

    public int compareTo(ObjectToBeCompared o) {
        return 0;
    }

}
