package Chapter5._0_OOP.Interfaces;
import org.junit.Assert;
import org.junit.Test;

public class ObjectToBeComparedTest {

    @Test
    public void comparableObjectTest1(){
        ObjectToBeCompared obj1 = new ObjectToBeCompared(1);
        ObjectToBeCompared obj2 = new ObjectToBeCompared(1);
        Assert.assertTrue(obj1.compareTo(obj2) == 0);
    }
    @Test
    public void comparableObjectTest2(){
        ObjectToBeCompared obj1 = new ObjectToBeCompared(0);
        ObjectToBeCompared obj2 = new ObjectToBeCompared(1);
        Assert.assertTrue(obj1.compareTo(obj2) < 0);
    }
    @Test
    public void comparableObjectTest3(){
        ObjectToBeCompared obj1 = new ObjectToBeCompared(1);
        ObjectToBeCompared obj2 = new ObjectToBeCompared(0);
        Assert.assertTrue(obj1.compareTo(obj2) > 0);
    }
}
