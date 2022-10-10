package Chapter5.Challenges.Fibonacci;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class FibonacciTest {
    static Fibonacci fib;
    @BeforeClass
    public static void setUp(){
        fib = new Fibonacci();
    }
    @Test
    public void fibTest1(){
        int input = 1;
        int expected = 1;
        Assert.assertEquals(fib.fib(input), expected);
    }
    @Test
    public void fibTest2(){
        int input = 3;
        int expected = 2;
        Assert.assertEquals(fib.fib(input), expected);
    }
    @Test
    public void fibTest3(){
        int input = 6;
        int expected = 8;
        Assert.assertEquals(fib.fib(input), expected);
    }
}
