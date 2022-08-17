package Chapter4._0_OOP.ObjectMethods.Equals;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ImplementEqualsMethodTest {
    static ImplementEqualsMethod iem1;
    static ImplementEqualsMethod iem2;
    static ImplementEqualsMethod iem3;
    static ImplementEqualsMethod iem4;
    static ImplementEqualsMethod iem5;
    static ImplementEqualsMethod iem6;
    @BeforeClass
    public static void setUp(){
        iem1 = new ImplementEqualsMethod(1,1,true);
        iem2 = new ImplementEqualsMethod(1,1,true);
        iem3 = new ImplementEqualsMethod(1,1,false);
        iem4 = new ImplementEqualsMethod(1,2,true);
        iem5 = new ImplementEqualsMethod(1,2,false);
        iem6 = new ImplementEqualsMethod(1,2,true);
    }
    @Test
    public void implementEqualsMethodTest1(){
        Assert.assertTrue(iem1.equals(iem1));
    }
    @Test
    public void implementEqualsMethodTest2(){
        Assert.assertTrue(iem1.equals(iem2));
    }
    @Test
    public void implementEqualsMethodTest3(){
        Assert.assertFalse(iem1.equals(iem3));
    }
    @Test
    public void implementEqualsMethodTest4(){
        Assert.assertFalse(iem1.equals(iem4));
    }
    @Test
    public void implementEqualsMethodTest5(){
        Assert.assertFalse(iem1.equals(iem4));
    }
    @Test
    public void implementEqualsMethodTest6(){
        Assert.assertTrue(iem4.equals(iem6));
    }
}
