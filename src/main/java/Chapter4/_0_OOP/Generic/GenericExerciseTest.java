package Chapter4._0_OOP.Generic;

import org.junit.Assert;
import org.junit.Test;

public class GenericExerciseTest {
    /**
     * If a GenericExercise is created that stores Strings, then it should be able to set and retrieve String values.
     */
    @Test
    public void GenericStringTest(){
        GenericExercise<String> ge = new GenericExercise<>();
        ge.loadGenericItem("generic");
        String expected = "generic";
        String actual = ge.returnGenericItem();
        Assert.assertEquals(expected, actual);
    }
    /**
     * If a GenericExercise is created that stores Objects of type Integer (a wrapper class for ints), then
     * it should be able to set and retrieve int values.
     */
    @Test
    public void GenericIntTest(){
        GenericExercise<Integer> ge = new GenericExercise<>();
        ge.loadGenericItem(5);
        int expected = 5;
        int actual = ge.returnGenericItem();
        Assert.assertEquals(expected, actual);
    }
}
