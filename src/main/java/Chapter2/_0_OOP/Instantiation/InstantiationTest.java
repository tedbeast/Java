package Chapter2._0_OOP.Instantiation;

import org.junit.Assert;
import org.junit.Test;

public class InstantiationTest {
//    lol
    InstantiationExample i = new InstantiationExample();

    /**
     * Because null represents the lack of an object, any return from instantiateANewObject which is not null
     * should be counted as a new object.
     *
     * (it's actually possible to pass this challenge without using the new keyword by using Strings or an object
     * received from a static method, or by returning a primitive (autoboxing), which will all be explained later.
     * For now, let's just focus on the 'new' keyword.)
     */
    @Test
    public void funnyTest(){
        Assert.assertNotNull(i.instantiateANewObject());
    }
}
