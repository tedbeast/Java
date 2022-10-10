package Chapter3._0_Collections.Sets;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Set;

public class SetExerciseTest {
    static SetExercise se;
    @BeforeClass
    public static void setUp(){
        se = new SetExercise();
    }

    /**
     * When a set is instantiated, it should not be null.
     */
    @Test
    public void createSetTest(){
        Set<Integer> set = se.createSet();
        Assert.assertNotNull(set);
    }

    /**
     * When a set is instantiated, its size should start at 0.
     */
    @Test
    public void getSizeTest(){
        Set<Integer> set = se.createSet();
        Assert.assertEquals(se.getSize(set), 0);
    }

    /**
     * When an item is added to an empty set, its size should be 1.
     */
    @Test
    public void getSizeTest2(){
        Set<Integer> set = se.createSet();
        set = se.addUniqueItem(set, 1);
        Assert.assertEquals(se.getSize(set), 1);
    }

    /**
     * When an item is added to a set, it should contain that item.
     */
    @Test
    public void addItemTest1(){
        Set<Integer> set = se.createSet();
        set = se.addUniqueItem(set, 1);
        Assert.assertTrue(set.contains(1));
        Assert.assertFalse(set.contains(2));
    }

    /**
     * When two items are added to a set, it should contain both of the items.
     */
    @Test
    public void addItemTest2(){
        Set<Integer> set = se.createSet();
        set = se.addUniqueItem(set, 1);
        set = se.addUniqueItem(set, 2);
        Assert.assertTrue(set.contains(1));
        Assert.assertTrue(set.contains(2));
    }

    /**
     * When an item is removed from a set from two items, it should not contain the removed item, but it should contain
     * the other item.
     */
    @Test
    public void removeItemTest1(){
        Set<Integer> set = se.createSet();
        set = se.addUniqueItem(set, 1);
        set = se.addUniqueItem(set, 2);
        set = se.removeItem(set, 2);
        Assert.assertTrue(set.contains(1));
        Assert.assertFalse(set.contains(2));
    }
}
