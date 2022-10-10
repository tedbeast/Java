package Chapter5._1_Collections.Stack;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Stack;

public class StackExersizeTest {
    static StackExersize se;
    @BeforeClass
    public static void setUp(){
        se = new StackExersize();
    }
    @Test
    public void createStackTest(){
        Stack<String> stack = se.createNewStack();
        Assert.assertNotNull(stack);
    }
    @Test
    public void getSizeTest1(){
        Stack<String> stack = se.createNewStack();
        Assert.assertEquals(se.getSize(stack), 0);
    }
    @Test
    public void getSizeTest2(){
        Stack<String> stack = se.createNewStack();
        stack = se.addToTopOfStack(stack, "Crime and Punishment");
        Assert.assertEquals(se.getSize(stack), 1);
    }
    @Test
    public void addToTopOfStackTest1(){
        Stack<String> stack = se.createNewStack();
        stack = se.addToTopOfStack(stack, "Crime and Punishment");
        stack = se.addToTopOfStack(stack, "Finnegan's Wake");
        Assert.assertEquals(se.getSize(stack), 2);
    }
    @Test
    public void removeFromTopOfStackTest1(){
        Stack<String> stack = se.createNewStack();
        stack = se.addToTopOfStack(stack, "Crime and Punishment");
        stack = se.addToTopOfStack(stack, "Finnegan's Wake");
        stack = se.addToTopOfStack(stack, "Don Quixote");
        String bookName = se.removeFromTopOfStack(stack);
        Assert.assertEquals(se.getSize(stack), 2);
        Assert.assertEquals(bookName, "Don Quixote");
    }
    @Test
    public void removeFromTopOfStackTest2(){
        Stack<String> stack = se.createNewStack();
        stack = se.addToTopOfStack(stack, "Crime and Punishment");
        stack = se.addToTopOfStack(stack, "Finnegan's Wake");
        stack = se.addToTopOfStack(stack, "Don Quixote");
        String bookName = se.removeFromTopOfStack(stack);
        Assert.assertEquals(bookName, "Don Quixote");
        bookName = se.removeFromTopOfStack(stack);
        Assert.assertEquals(se.getSize(stack), 1);
        Assert.assertEquals(bookName, "Finnegan's Wake");
    }
    @Test
    public void getTopOfStackWithoutRemovingTest1(){
        Stack<String> stack = se.createNewStack();
        stack = se.addToTopOfStack(stack, "Crime and Punishment");
        stack = se.addToTopOfStack(stack, "Finnegan's Wake");
        stack = se.addToTopOfStack(stack, "Don Quixote");
        String bookName = se.getTopOfStackWithoutRemoving(stack);
        Assert.assertEquals(bookName, "Don Quixote");
        Assert.assertEquals(se.getSize(stack), 3);
    }
}
