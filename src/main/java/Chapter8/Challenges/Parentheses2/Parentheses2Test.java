package Chapter8.Challenges.Parentheses2;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Parentheses2Test {
    public static Parentheses2 p2;
    @BeforeClass
    public static void setUp(){
        p2 = new Parentheses2();
    }
    @Test
    public void parentheses2Test1(){
        String input = "()";
        boolean expected = true;
        Assert.assertEquals(expected, p2.validate(input));
    }
    @Test
    public void parentheses2Test2(){
        String input = "(){}[]";
        boolean expected = true;
        Assert.assertEquals(expected, p2.validate(input));
    }
    @Test
    public void parentheses2Test3(){
        String input = "({})";
        boolean expected = true;
        Assert.assertEquals(expected, p2.validate(input));
    }
    @Test
    public void parentheses2Test4(){
        String input = "({[]}[])";
        boolean expected = true;
        Assert.assertEquals(expected, p2.validate(input));
    }
    @Test
    public void parentheses2Test5(){
        String input = ")(";
        boolean expected = false;
        Assert.assertEquals(expected, p2.validate(input));
    }
    @Test
    public void parentheses2Test6(){
        String input = "()))";
        boolean expected = false;
        Assert.assertEquals(expected, p2.validate(input));
    }
    @Test
    public void parentheses2Test7(){
        String input = "({)}";
        boolean expected = false;
        Assert.assertEquals(expected, p2.validate(input));
    }
    @Test
    public void parentheses2Test8(){
        String input = "(}{)";
        boolean expected = false;
        Assert.assertEquals(expected, p2.validate(input));
    }
    @Test
    public void parentheses2Test9(){
        String input = "(([)])";
        boolean expected = false;
        Assert.assertEquals(expected, p2.validate(input));
    }
}
