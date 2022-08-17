package Chapter4._0_OOP.StaticKeyword;

import org.junit.Assert;
import org.junit.Test;

public class ClassTest
{
    Runner r = new Runner();
    @Test
    public void classTest1(){
        Class.global_var="abc";
        r.changeClassVar("xyz");
        Assert.assertEquals(Class.global_var, "xyz");

    }
}
