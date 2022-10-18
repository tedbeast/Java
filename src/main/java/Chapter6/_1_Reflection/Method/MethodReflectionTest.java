package Chapter6._1_Reflection.Method;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodReflectionTest {
    MethodReflection mr = new MethodReflection();
    @Test
    public void MethodReflectionTest1(){
        Method[] expected = MethodReflection.class.getMethods();
        Method[] actual = mr.getMyMethods();
        System.out.println(Arrays.toString(expected));
        Assert.assertArrayEquals(expected,actual);
    }
}
