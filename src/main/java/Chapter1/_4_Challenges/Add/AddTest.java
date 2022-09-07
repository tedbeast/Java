package Chapter1._4_Challenges.Add;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddTest {
    static Add a;
    @BeforeClass
    public static void setUp(){
        a = new Add();
    }
    @Test
    public void addTest1(){
        int input1 = 1;
        int input2 = 2;
        int expected = 3;
        int actual = a.addNumbers(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void addTest2(){
        int input1 = 3;
        int input2 = 4;
        int expected = 7;
        int actual = a.addNumbers(input1, input2);
        Assert.assertEquals(expected, actual);
    }
}
