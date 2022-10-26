package Chapter9._1_DataStructuresAndAlgorithms.HashSetImplementation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashSetImplementationTest {
    HashSetImplementation<String> hashSet;
    @Before
    public void setUp(){
        hashSet = new HashSetImplementation<String>();
    }
    /**
     * When the hashSet is created, it should not be null, and its size should be zero.
     */
    @Test
    public void hashSetTest1(){
        Assert.assertNotNull(hashSet);
        Assert.assertEquals(hashSet.size(), null);
    }

    /**
     * When an item is added to an empty hashSet, the hashSet should contain the item and its size should be 1.
     */
    @Test
    public void hashSetAddTest1(){
        String item = "item 1";
        hashSet.add(item);
        Assert.assertTrue(hashSet.contains(item));
        Assert.assertEquals(hashSet.size(), 1);
    }
    /**
     * When many items are added to a hashSet, the hashSet should contain all the items and its size should reflect
     * all the items added.
     */
    @Test
    public void hashSetAddTest2(){
        String item1 = "item 1";
        String item2 = "item 2";
        String item3 = "item 3";
        String item4 = "item 4";
        hashSet.add(item1);
        hashSet.add(item2);
        hashSet.add(item3);
        hashSet.add(item4);
        Assert.assertTrue(hashSet.contains(item1));
        Assert.assertTrue(hashSet.contains(item2));
        Assert.assertTrue(hashSet.contains(item3));
        Assert.assertTrue(hashSet.contains(item4));
        Assert.assertEquals(hashSet.size(), 4);
    }
}
