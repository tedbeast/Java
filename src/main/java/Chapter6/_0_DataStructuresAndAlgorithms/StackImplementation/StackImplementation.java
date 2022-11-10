package Chapter6._0_DataStructuresAndAlgorithms.StackImplementation;

import java.util.Stack;

/**
 * Stack is actually one of the easiest data structures to implement, so we'll start with it.
 * Conceptually, always think of a stack like a real stack of something (plates, papers, etc). Remember that
 * stacks are LIFO: the most recently added item is the next to be removed.
 * @param <T> the type of data that the Stack will contain.
 */
public class StackImplementation<T> {
    /**
     * The item that is currently at the top of the stack.
     */
    private StackNode<T> head;
    private int size;

    /**
     * Push a new item to the stack:
     * 1) If the head of the stack is null (stack is empty), set the head to a new StackNode containing value.
     * 2) Otherwise, set the head to a new StackNode containing value and set the next value of StackNode to the old
     * head. Set the head to the new StackNode.
     * Don't forget to increment the size!
     */
    public void push(T value){

    }

    /**
     * You can check if the stack is empty by simply checking if the head is null or not.
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty(){
        return false;
    }

    /**
     * @return the value of the head (top item) of the stack.
     */
    public T peek(){
        return null;
    }
    /**
     * @return the value of the head (top item) of the stack, and set the head to the next node of the old head.
     * check that the head is not null before you try accessing the next node to avoid a null pointer exception.
     * Don't forget to decrement the size!
     */
    public T pop(){
        return null;
    }

    /**
     * No need to change this method. It is needed for testing.
     * @return the number of items in the stack.
     */
    public int size(){
        return size;
    }
}