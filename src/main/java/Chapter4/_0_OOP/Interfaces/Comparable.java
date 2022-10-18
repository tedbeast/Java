package Chapter4._0_OOP.Interfaces;

/**
 * interfaces contain methods without bodies, and classes and implement the interfaces must implement the methods.
 * Notice how this interface has a signature for a method, but it doesn't have a body (it ends with a semicolon
 * rather than curly braces.) Its code will be written by the implementing class.
 * You can implement multiple interfaces, but you cannot extend multiple classes.
 * @param <T> the Object that the class that implements this interface will be compared to (usually we write
 *           the class's own name.)
 */
public interface Comparable<T> {

    int compareTo(T data);

}
