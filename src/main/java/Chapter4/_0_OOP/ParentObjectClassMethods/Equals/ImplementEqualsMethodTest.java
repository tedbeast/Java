package Chapter4._0_OOP.ParentObjectClassMethods.Equals;
import org.junit.Assert;
import org.junit.Test;

public class ImplementEqualsMethodTest {

    /**
     * An object should be equal to itself.
     */
    @Test
    public void implementEqualsMethodTest1(){
        ImplementEqualsMethod iem1 = new ImplementEqualsMethod(1,1,true);
        Assert.assertTrue(iem1.equals(iem1));
    }

    /**
     * An object should be equal to ano object which is exactly equivalent to it.
     */
    @Test
    public void implementEqualsMethodTest2(){
        ImplementEqualsMethod iem1 = new ImplementEqualsMethod(1,1,true);
        ImplementEqualsMethod iem2 = new ImplementEqualsMethod(1,1,true);
        Assert.assertTrue(iem1.equals(iem2));
    }

    /**
     * An object should not be equal to an object which has a differing value (c)
     */
    @Test
    public void implementEqualsMethodTest3(){
        ImplementEqualsMethod iem1 = new ImplementEqualsMethod(1,1,true);
        ImplementEqualsMethod iem3 = new ImplementEqualsMethod(1,1,false);
        Assert.assertFalse(iem1.equals(iem3));
    }
    /**
     * An object should not be equal to an object which has a differing value (b)
     */
    @Test
    public void implementEqualsMethodTest4(){
        ImplementEqualsMethod iem1 = new ImplementEqualsMethod(1,1,true);
        ImplementEqualsMethod iem4 = new ImplementEqualsMethod(1,2,true);
        Assert.assertFalse(iem1.equals(iem4));
    }
    /**
     * An object should be equal to ano object which is exactly equivalent to it.
     */
    @Test
    public void implementEqualsMethodTest5(){

        ImplementEqualsMethod iem4 = new ImplementEqualsMethod(1,2,true);
        ImplementEqualsMethod iem6 = new ImplementEqualsMethod(1,2,true);
        Assert.assertTrue(iem4.equals(iem6));
    }
}
