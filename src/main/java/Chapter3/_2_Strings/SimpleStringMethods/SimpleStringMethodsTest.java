package Chapter3._2_Strings.SimpleStringMethods;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleStringMethodsTest {
    static SimpleStringMethods ssm;
    @BeforeClass
    public static void setUp(){
        ssm = new SimpleStringMethods();
    }
    @Test
    public void lengthTest(){
        Assert.assertEquals(3, ssm.length("aaa"));
    }
    @Test
    public void charAtTest1(){
        Assert.assertEquals(ssm.charAt("abcdef", 2), 'c');
    }
    @Test
    public void charAtTest2(){
        Assert.assertEquals(ssm.charAt("abcdef", 0), 'a');
    }
    @Test
    public void indexOfTest1(){
        Assert.assertEquals(ssm.indexOf("zebra", 'b'), 2);
    }
    @Test
    public void indexOfTest2(){
        Assert.assertEquals(ssm.indexOf("banana", 'q'), -1);
    }

}
