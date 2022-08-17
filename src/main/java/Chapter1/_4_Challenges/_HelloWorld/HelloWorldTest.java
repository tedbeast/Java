package Chapter1._4_Challenges._HelloWorld;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {
    HelloWorld hw = new HelloWorld();
    @Test
    public void helloTest(){
        String expected = "Hello, world!";
        String actual = hw.sayHello().trim();
        Assert.assertEquals(expected,actual);
    }
}
