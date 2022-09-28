package Chapter2._0_OOP.Instantiation;

import org.junit.Assert;
import org.junit.Test;

public class InstantiationTest {
//    lol
    InstantiationExample i = new InstantiationExample();
    @Test
    public void reallyStupidTest(){
        Assert.assertNotNull(i.instantiateANewObject());
    }
}
