package Chapter4._0_OOP.Interfaces;
import org.junit.Assert;
import org.junit.Test;

public class ObjectToBeComparedTest {

    /**
     * If obj1 and obj2 are equivalent, compareTo should return 0.
     */
    @Test
    public void comparableObjectTest1(){
        ObjectToBeCompared obj1 = new ObjectToBeCompared(1);
        ObjectToBeCompared obj2 = new ObjectToBeCompared(1);
        Assert.assertTrue(obj1.compareTo(obj2) == 0);
    }

    /**
     * If obj1 has a smaller value than that of obj1, obj1.compareTo(obj2) should return a value less than 0.
     */
    @Test
    public void comparableObjectTest2(){
        ObjectToBeCompared obj1 = new ObjectToBeCompared(0);
        ObjectToBeCompared obj2 = new ObjectToBeCompared(1);
        Assert.assertTrue(obj1.compareTo(obj2) < 0);
    }
    /**
     * If obj1 has a greater value than that of obj1, obj1.compareTo(obj2) should return a value greater than 0.
     */
    @Test
    public void comparableObjectTest3(){
        ObjectToBeCompared obj1 = new ObjectToBeCompared(1);
        ObjectToBeCompared obj2 = new ObjectToBeCompared(0);
        Assert.assertTrue(obj1.compareTo(obj2) > 0);
    }
}
