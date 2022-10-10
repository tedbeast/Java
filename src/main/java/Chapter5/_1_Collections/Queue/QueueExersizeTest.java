package Chapter5._1_Collections.Queue;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Queue;

public class QueueExersizeTest {
    static QueueExersize qe ;
    @BeforeClass
    public static void setUp(){
        qe = new QueueExersize();
    }
    @Test
    public void createQueueTest(){
        Queue<String> queue = qe.createQueue();
        Assert.assertNotNull(queue);
    }
    @Test
    public void getSizeTest1(){
        Queue<String> queue = qe.createQueue();
        Assert.assertEquals(qe.getSize(queue), 0);
    }
    @Test
    public void addToQueueTest1(){
        Queue<String> queue = qe.createQueue();
        queue = qe.addToEndOfQueue(queue, "Jim");
        Assert.assertEquals(qe.getSize(queue), 1);
    }
    @Test
    public void addToQueueTest2(){
        Queue<String> queue = qe.createQueue();
        queue = qe.addToEndOfQueue(queue, "Jim");
        queue = qe.addToEndOfQueue(queue, "Sally");
        queue = qe.addToEndOfQueue(queue, "Kate");
        Assert.assertEquals(qe.getSize(queue), 3);
    }
    @Test
    public void removeFromStartOfQueueTest1(){
        Queue<String> queue = qe.createQueue();
        queue = qe.addToEndOfQueue(queue, "Jim");
        queue = qe.addToEndOfQueue(queue, "Sally");
        queue = qe.addToEndOfQueue(queue, "Kate");
        String name = qe.removeFromStartOfQueue(queue);
        Assert.assertEquals(name, "Jim");
        Assert.assertEquals(qe.getSize(queue), 2);
    }
    @Test
    public void removeFromStartOfQueueTest2(){
        Queue<String> queue = qe.createQueue();
        queue = qe.addToEndOfQueue(queue, "Jim");
        queue = qe.addToEndOfQueue(queue, "Sally");
        queue = qe.addToEndOfQueue(queue, "Kate");
        String name = qe.removeFromStartOfQueue(queue);
        Assert.assertEquals(name, "Jim");
        name = qe.removeFromStartOfQueue(queue);
        Assert.assertEquals(name, "Sally");
        name = qe.removeFromStartOfQueue(queue);
        Assert.assertEquals(name, "Kate");
        Assert.assertEquals(qe.getSize(queue), 0);
    }
    @Test
    public void getStartOfQueueWithoutRemovingTest1(){
        Queue<String> queue = qe.createQueue();
        queue = qe.addToEndOfQueue(queue, "Jim");
        queue = qe.addToEndOfQueue(queue, "Sally");
        queue = qe.addToEndOfQueue(queue, "Kate");
        String name = qe.getStartOfQueueWithoutRemoving(queue);
        Assert.assertEquals(name, "Jim");
        Assert.assertEquals(qe.getSize(queue), 3);
    }
}
