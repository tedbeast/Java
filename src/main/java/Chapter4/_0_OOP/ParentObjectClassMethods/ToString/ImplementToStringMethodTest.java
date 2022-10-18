package Chapter4._0_OOP.ParentObjectClassMethods.ToString;
import org.junit.Assert;
import org.junit.Test;

public class ImplementToStringMethodTest {
    /**
     * Whatever the output that a toString contains, if an object is created with the values 1, 1, true it should
     * contain all of those values.
     */
    @Test
    public void toStringTest1(){
        ImplementToStringMethod ts = new ImplementToStringMethod(1,1,true);
        String output = ts.toString();
        Assert.assertTrue(output.contains("1"));
        Assert.assertFalse(output.contains("2"));
        Assert.assertTrue(output.contains("true"));
        Assert.assertFalse(output.contains("false"));
    }
    /**
     * Whatever the output that a toString contains, if an object is created with the values 1, 2, true it should
     * contain all of those values.
     */
    @Test
    public void toStringTest2(){
        ImplementToStringMethod ts = new ImplementToStringMethod(1,2,true);
        String output = ts.toString();
        Assert.assertTrue(output.contains("1"));
        Assert.assertTrue(output.contains("2"));
        Assert.assertTrue(output.contains("true"));
        Assert.assertFalse(output.contains("false"));
    }
    /**
     * Whatever the output that a toString contains, if an object is created with the values 1, 1, false it should
     * contain all of those values.
     */
    @Test
    public void toStringTest3(){
        ImplementToStringMethod ts = new ImplementToStringMethod(1,1,false);
        String output = ts.toString();
        Assert.assertTrue(output.contains("1"));
        Assert.assertFalse(output.contains("2"));
        Assert.assertFalse(output.contains("true"));
        Assert.assertTrue(output.contains("false"));
    }
    /**
     * Whatever the output that a toString contains, if an object is created with the values 1, 2, false it should
     * contain all of those values.
     */
    @Test
    public void toStringTest4(){
        ImplementToStringMethod ts = new ImplementToStringMethod(1,2,false);
        String output = ts.toString();
        Assert.assertTrue(output.contains("1"));
        Assert.assertTrue(output.contains("2"));
        Assert.assertFalse(output.contains("true"));
        Assert.assertTrue(output.contains("false"));
    }
}
