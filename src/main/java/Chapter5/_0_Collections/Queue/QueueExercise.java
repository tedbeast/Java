package Chapter5._0_Collections.Queue;
/**
 * TODO: switch to deque
 */

import java.util.Queue;

/**
 * Queues are FIFO - first in, first out, like a checkout line. They are used in algorithms where it is needed to keep
 * track of the ordering that elements were inserted.
 */
public class QueueExercise {
    /**
     * @return an instantiated Queue. Queue, by itself, doesn't have a class, so you should use a class that implements
     * the Queue interface, such as ArrayDeque. Deques contain all the methods required for both Queue and Stack
     * behavior.
     */
    public Queue<String> createQueue(){
        return null;
    }

    /**
     * @param queue a Queue<String> object.
     * @return the length of queue.
     */
    public int getSize(Queue<String> queue){
        return 0;
    }

    /**
     * add an item to the end of the queue - the queue will be able to return to that item once all the items
     * in front of it have been removed.
     * @param queue a Queue<String> object.
     * @param item a String that should be added to Queue.
     */
    public void addToEndOfQueue(Queue<String> queue, String item){

    }

    /**
     * Remove an item from a queue, and return the removed item.
     * (The method used to remove items from queues also returns the item.)
     * @param queue a Queue<String> object.
     * @return the next String due to be removed (polled) from the Queue<String> (the oldest item in the queue.)
     */
    public String removeFromStartOfQueue(Queue<String> queue){
        return "";
    }

    /**
     * Return the next item from a queue which is due to be removed, but do not remove it.
     * @param queue a Queue<String> object.
     * @return the next String due to be removed (peeked) from the Queue<String> (the oldest item in the queue.)
     */
    public String getStartOfQueueWithoutRemoving(Queue<String> queue){
        return "";
    }
}
