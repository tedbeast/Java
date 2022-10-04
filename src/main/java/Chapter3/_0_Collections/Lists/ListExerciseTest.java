package Chapter3._0_Collections.Lists;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class ListExerciseTest {
    static ListExercise le;
    @BeforeClass
    public static void setUp(){
        le = new ListExercise();
    }

    /**
     * When a list is properly instantiated, it should not be null.
     */
    @Test
    public void createListTest1(){
        List<Integer> list = le.createList();
        Assert.assertNotNull(list);
    }

    /**
     * When a list is first instantiated, its size should be 0 (it is empty.)
     */
    @Test
    public void getSizeTest1(){
        List<Integer> list = le.createList();
        Assert.assertTrue(le.getSize(list) == 0);
    }

    /**
     * When an item is added to an empty list, its size should be 1.
     */
    @Test
    public void getSizeTest2(){
        List<Integer> list = le.createList();
        le.addToList(list, 1);
        Assert.assertTrue(le.getSize(list) == 1);
    }

    /**
     * When an item is added to a list, it should contain that item.
     */
    @Test
    public void addItemTest1(){
        List<Integer> list = le.createList();
        le.addToList(list, 1);
        Assert.assertTrue(list.contains(1));
    }

    /**
     * When two items are added to a list, it should contain both items.
     */
    @Test
    public void addItemTest2(){
        List<Integer> list = le.createList();
        le.addToList(list, 1);
        le.addToList(list, 2);
        Assert.assertTrue(list.contains(1));
        Assert.assertTrue(list.contains(2));
    }

    /**
     * When an item is added to an empty list, the item can be retrieved by getting the element at index 0.
     */
    public @Test void getItemTest1(){
        List<Integer> list = le.createList();
        le.addToList(list, 1);
        Assert.assertTrue(le.get(list, 0) == 1);
    }

    /**
     * When two items are added to an empty list, the second item can be retrieved by getting the element at index 1.
     */
    public @Test void getItemTest2(){
        List<Integer> list = le.createList();
        le.addToList(list, 1);
        le.addToList(list, 2);
        Assert.assertTrue(le.get(list, 1) == 2);
    }

    /**
     * When the only item in a list is removed, that list should be empty and should not contain the item.
     */
    public @Test void removeFromListTest1(){
        List<Integer> list = le.createList();
        le.addToList(list, 1);
        le.removeFromList(list, 0);
        Assert.assertFalse(list.contains(1));
        Assert.assertTrue(le.getSize(list) == 0);
    }

    /**
     * When an item is remove from a list that has two elements, it should not contain the removed item, but should
     * still contain the other item and have a size of 1.
     */
    public @Test void removeFromListTest2(){
        List<Integer> list = le.createList();
        le.addToList(list, 1);
        le.addToList(list, 2);
        le.removeFromList(list, 1);
        Assert.assertTrue(list.contains(1));
        Assert.assertFalse(list.contains(2));
        Assert.assertTrue(le.getSize(list) == 1);
    }

    /**
     * When we update a value in list, it should contain the new value and should not contain the old value.
     */
    public @Test void updatePositionTest1(){
        List<Integer> list = le.createList();
        le.addToList(list, 1);
        le.addToList(list, 2);
        le.updateAtPosition(list, 0, 3);
        Assert.assertTrue(list.contains(3));
        Assert.assertFalse(list.contains(1));
    }

    /**
     * When we update a value in list, it should contain the new value and should not contain the old value.
     */
    public @Test void updatePositionTest2(){
        List<Integer> list = le.createList();
        le.addToList(list, 1);
        le.addToList(list, 2);
        le.updateAtPosition(list, 1, 3);
        Assert.assertTrue(list.contains(3));
        Assert.assertFalse(list.contains(2));
    }
}
