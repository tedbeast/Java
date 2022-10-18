package Chapter6._0_DataStructuresAndAlgorithms.StackImplementation;

/**
 * No need to change anything in this class (other than perhaps adding getters and setters).
 * @param <T>
 */
public class StackNode<T> {
    T data;
    StackNode<T> next;
    public StackNode(T data, StackNode<T> next){
        this.data = data;
        this.next = next;
    }
}
