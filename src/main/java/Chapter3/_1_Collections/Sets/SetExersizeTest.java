package Chapter3._1_Collections.Sets;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Set;

public class SetExersizeTest {
    static SetExersize se;
    @BeforeClass
    public static void setUp(){
        se = new SetExersize();
    }
    @Test
    public void createSetTest(){
        Set<Integer> set = se.createSet();
        Assert.assertNotNull(set);
    }
    @Test
    public void getSizeTest(){
        Set<Integer> set = se.createSet();
        Assert.assertEquals(se.getSize(set), 0);
    }
    @Test
    public void getSizeTest2(){
        Set<Integer> set = se.createSet();
        set = se.addUniqueItem(set, 1);
        Assert.assertEquals(se.getSize(set), 1);
    }
    @Test
    public void addItemTest1(){
        Set<Integer> set = se.createSet();
        set = se.addUniqueItem(set, 1);
        Assert.assertTrue(set.contains(1));
        Assert.assertFalse(set.contains(2));
    }
    @Test
    public void addItemTest2(){
        Set<Integer> set = se.createSet();
        set = se.addUniqueItem(set, 1);
        set = se.addUniqueItem(set, 2);
        Assert.assertTrue(set.contains(1));
        Assert.assertTrue(set.contains(2));
    }
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
