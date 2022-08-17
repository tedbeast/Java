package Chapter4._1_Collections.Map;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Map;

public class MapExersizeTest {
    static MapExersize me;
    @BeforeClass
    public static void setUp(){
        me = new MapExersize();
    }
    @Test
    public void createMapTest(){
        Map<Integer, String> map = me.createMap();
        Assert.assertNotNull(map);
    }
    @Test
    public void getSizeTest1(){
        Map<Integer, String> map = me.createMap();
        Assert.assertEquals(me.getSize(map), 0);
    }
    @Test
    public void getSizeTest2(){
        Map<Integer, String> map = me.createMap();
        map = me.addKeyValuePair(map, 1, "banana");
        Assert.assertEquals(me.getSize(map), 1);
    }
    @Test
    public void addKeyValuePairTest1(){
        Map<Integer, String> map = me.createMap();
        map = me.addKeyValuePair(map, 1, "banana");
        Assert.assertEquals(me.getValueFromKey(map, 1), "banana");
    }
    @Test
    public void addKeyValuePairTest2(){
        Map<Integer, String> map = me.createMap();
        map = me.addKeyValuePair(map, 1, "banana");
        map = me.addKeyValuePair(map, 2, "pear");
        Assert.assertEquals(me.getValueFromKey(map, 2), "pear");
    }
    @Test
    public void removeKeyValuePairTest1(){
        Map<Integer, String> map = me.createMap();
        map = me.addKeyValuePair(map, 1, "banana");
        map = me.addKeyValuePair(map, 2, "pear");
        map = me.removeKeyValuePair(map, 2);
        Assert.assertFalse(map.containsKey(2));
    }
    @Test
    public void overwriteValueTest1(){
        Map<Integer, String> map = me.createMap();
        map = me.addKeyValuePair(map, 1, "banana");
        map = me.addKeyValuePair(map, 2, "pear");
        map = me.overwriteValue(map, 2, "apple");
        Assert.assertTrue(map.containsKey(2));
        Assert.assertEquals(me.getValueFromKey(map, 2), "apple");
    }
}
