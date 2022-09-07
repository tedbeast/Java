package Chapter4._2_Strings.OtherStringMethods;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class OtherStringMethodsTest {
    static OtherStringMethods osm;
    @BeforeClass
    public static void setUp(){
        osm = new OtherStringMethods();
    }
    @Test
    public void partOfStringTest1(){
        Assert.assertEquals(osm.partOfString("banana", 0, 3), "ban");
    }
    @Test
    public void partOfStringTest2(){
        Assert.assertEquals(osm.partOfString("apple", 1, 5), "pple");
    }
    @Test
    public void compareToTest1(){
        Assert.assertTrue(osm.compareLexigraphically("banana", "apple") > 0);
    }
    @Test
    public void compareToTest2(){
        Assert.assertTrue(osm.compareLexigraphically("monkey", "penguin") < 0);
    }
    @Test
    public void compareToTest3(){
        Assert.assertTrue(osm.compareLexigraphically("java", "java") == 0);
    }
    @Test
    public void splitStringTest1(){
        String input = "banana apple pear";
        String splitAround = " ";
        String[] expected = {"banana", "apple", "pear"};
        Assert.assertArrayEquals(osm.splitStringIntoMultipleStrings(input, splitAround), expected);
    }
    @Test
    public void splitStringTest2(){
        String input = "src.main.java";
        String splitAround = "\\.";
        String[] expected = {"src", "main", "java"};
        Assert.assertArrayEquals(osm.splitStringIntoMultipleStrings(input, splitAround), expected);
    }
}
