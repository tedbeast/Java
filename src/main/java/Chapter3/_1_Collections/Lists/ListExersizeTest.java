package Chapter3._1_Collections.Lists;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class ListExersizeTest {
    static ListExersize le;
    @BeforeClass
    public static void setUp(){
        le = new ListExersize();
    }
    @Test
    public void createListTest1(){
        List<Integer> list = le.createList();
        Assert.assertNotNull(list);
    }
    @Test
    public void getSizeTest1(){
        List<Integer> list = le.createList();
        Assert.assertTrue(le.getSize(list) == 0);
    }
    @Test
    public void getSizeTest2(){
        List<Integer> list = le.createList();
        list = le.addToList(list, 1);
        Assert.assertTrue(le.getSize(list) == 1);
    }
    @Test
    public void addItemTest1(){
        List<Integer> list = le.createList();
        list = le.addToList(list, 1);
        Assert.assertTrue(list.contains(1));
    }
    @Test
    public void addItemTest2(){
        List<Integer> list = le.createList();
        list = le.addToList(list, 1);
        list = le.addToList(list, 2);
        Assert.assertTrue(list.contains(1));
        Assert.assertTrue(list.contains(2));
    }
    @Test void getItemTest1(){
        List<Integer> list = le.createList();
        list = le.addToList(list, 1);
        Assert.assertTrue(le.get(list, 0) == 1);
    }
    @Test void getItemTest2(){
        List<Integer> list = le.createList();
        list = le.addToList(list, 1);
        list = le.addToList(list, 2);
        Assert.assertTrue(le.get(list, 1) == 2);
    }
    @Test void removeFromListTest1(){
        List<Integer> list = le.createList();
        list = le.addToList(list, 1);
        le.removeFromList(list, 0);
        Assert.assertFalse(list.contains(1));
        Assert.assertTrue(le.getSize(list) == 0);
    }
    @Test void removeFromListTest2(){
        List<Integer> list = le.createList();
        list = le.addToList(list, 1);
        list = le.addToList(list, 2);
        le.removeFromList(list, 1);
        Assert.assertTrue(list.contains(1));
        Assert.assertFalse(list.contains(2));
        Assert.assertTrue(le.getSize(list) == 1);
    }
    @Test void updatePositionTest1(){
        List<Integer> list = le.createList();
        list = le.addToList(list, 1);
        list = le.addToList(list, 2);
        le.updateAtPosition(list, 3, 0);
        Assert.assertTrue(list.contains(3));
        Assert.assertFalse(list.contains(1));
    }
    @Test void updatePositionTest2(){
        List<Integer> list = le.createList();
        list = le.addToList(list, 1);
        list = le.addToList(list, 2);
        le.updateAtPosition(list, 3, 1);
        Assert.assertTrue(list.contains(3));
        Assert.assertFalse(list.contains(2));
    }
}
