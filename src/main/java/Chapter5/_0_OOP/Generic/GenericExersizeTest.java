package Chapter5._0_OOP.Generic;

import org.junit.Assert;
import org.junit.Test;

public class GenericExersizeTest {
    @Test
    public void GenericIntTest(){
        GenericExersize<Integer> ge = new GenericExersize<>();
        Assert.assertTrue(ge.returnGeneric() instanceof Integer);
    }
    @Test
    public void GenericStringTest(){
        GenericExersize<String> ge = new GenericExersize<>();
        Assert.assertTrue(ge.returnGeneric() instanceof String);
    }
}
