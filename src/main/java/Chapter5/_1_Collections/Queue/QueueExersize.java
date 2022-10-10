package Chapter5._1_Collections.Queue;

import java.util.Queue;

public class QueueExersize {
    public Queue<String> createQueue(){
//        create a brand new queue
        return null;
    }
    public int getSize(Queue<String> queue){
//        get number of items in queue
        return 0;
    }
    public Queue<String> addToEndOfQueue(Queue<String> queue, String item){
//        add to the queue before return
        return queue;
    }
    public String removeFromStartOfQueue(Queue<String> queue){
//        return the item that is removed from the queue.
/*        unlike the other collection examples, I am returning a string in this case. The original queue will
          still be modified. This reflects how we'd usually use a queue, because we want to say something like
          "get me the user who is next in line for tech support chatline while also removing them from the waiting line"
 */
        return "";
    }
    public String getStartOfQueueWithoutRemoving(Queue<String> queue){
//        return the next in line for queue without removing the item.
        return "";
    }
}
