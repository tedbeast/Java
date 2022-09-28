package Chapter5._0_OOP.Generic;

import org.junit.Assert;
import org.junit.Test;

public class GenericExerciseTest {
    @Test
    public void GenericIntTest(){
        GenericExercise<Integer> ge = new GenericExercise<>();
        ge.loadGenericItem(5);
        int expected = 5;
        int actual = ge.returnGenericItem();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void GenericStringTest(){
        GenericExercise<String> ge = new GenericExercise<>();
        ge.loadGenericItem("generic");
        String expected = "generic";
        String actual = ge.returnGenericItem();
        Assert.assertEquals(expected, actual);
    }
}
