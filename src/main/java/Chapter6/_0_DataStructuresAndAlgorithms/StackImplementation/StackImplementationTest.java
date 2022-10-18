package Chapter6._0_DataStructuresAndAlgorithms.StackImplementation;

import org.junit.Assert;
import org.junit.Test;

public class StackImplementationTest {
    /**
     * A newly instantiated stack should have a size of 0.
     */
    @Test
    public void stackSizeTest1(){
        StackImplementation<String> stack = new StackImplementation<>();
        int expected = 0;
        int actual = stack.size();
        Assert.assertEquals(expected, actual);
    }

    /**
     * A new stack which has had an item added to it should have a size of 1.
     */
    @Test
    public void stackAddTest1(){
        StackImplementation<String> stack = new StackImplementation<>();
        stack.push("item 1");
        int expected = 1;
        int actual = stack.size();
        Assert.assertEquals(expected, actual);
    }

    /**
     * If a value is pushed to the stack, popping from the stack should retrieve that value. Also, its size
     * should be 0 after the pop.
     */
    @Test
    public void popTest1(){
        StackImplementation<String> stack = new StackImplementation<>();
        stack.push("item 1");
        String expected = "item 1";
        String actual = stack.pop();
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(0, stack.size());
    }
    /**
     * Items should be popped in LIFO order, the popped item should be the most recently one added.
     */
    @Test
    public void popTest2(){
        StackImplementation<String> stack = new StackImplementation<>();
        stack.push("item 1");
        stack.push("item 2");
        stack.push("item 3");
        Assert.assertEquals("item 3", stack.pop());
        Assert.assertEquals("item 2", stack.pop());
        Assert.assertEquals("item 1", stack.pop());
        Assert.assertEquals(0, stack.size());
    }

    /**
     * Peeking from a stack should return the most recently added item, and it should not decrease the stack size.
     */
    @Test
    public void peekTest1(){
        StackImplementation<String> stack = new StackImplementation<>();
        stack.push("item 1");
        stack.push("item 2");
        stack.push("item 3");
        Assert.assertEquals("item 3", stack.peek());
        Assert.assertEquals(3, stack.size());
    }
}
