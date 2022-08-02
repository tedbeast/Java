package Core.OOP.Interfaces;

/*
interfaces contain methods without bodies, and classes and implement the interfaces must implement the methods.
you can implement multiple interfaces, unlike classes, since you cannot extend multiple classes.
 */

public interface Comparable<T> {

    public int compareTo(T data);

}
