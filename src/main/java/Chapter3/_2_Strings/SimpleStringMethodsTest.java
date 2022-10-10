package Chapter3._2_Strings;

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

    /**
     * the length of "aaa" should return 3.
     */
    @Test
    public void lengthTest(){
        Assert.assertEquals(3, ssm.length("aaa"));
    }
    /**
     * the char at position 2 of 'abcdef' should return 'c'.
     */
    @Test
    public void charAtTest1(){
        Assert.assertEquals(ssm.charAt("abcdef", 2), 'c');
    }
    /**
     * the char at position 0 of 'abcdef' should return 'a'.
     */
    @Test
    public void charAtTest2(){
        Assert.assertEquals(ssm.charAt("abcdef", 0), 'a');
    }
    /**
     * the index of 'b' of "zebra" should return 2.
     */
    @Test
    public void indexOfTest1(){
        Assert.assertEquals(ssm.indexOf("zebra", 'b'), 2);
    }
    /**
     * the index of 'q' of "zebra" should return -1.
     */
    @Test
    public void indexOfTest2(){
        Assert.assertEquals(ssm.indexOf("banana", 'q'), -1);
    }

}
