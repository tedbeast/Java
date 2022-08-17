package Chapter2._0_OOP.Instantiation;

import org.junit.Assert;
import org.junit.Test;

public class InstantiationTest {
//    lol
    Instantiation i = new Instantiation();
    @Test
    public void reallyStupidTest(){
        Assert.assertNotNull(i.instantiate());
    }
}
