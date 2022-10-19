package Chapter7._0_DataStructuresAndAlgorithms.ArrayListImplementation;

import org.junit.Assert;
import org.junit.Test;

public class ArrayListImplementationTest {
    /**
     * When an item is added to an empty ArrayList, its size should increase from 0 to 1.
     */
    @Test
    public void addTest1(){
        ArrayListImplementation<String> arrayList = new ArrayListImplementation<>();
        Assert.assertEquals(0, arrayList.size());
        arrayList.add("item 1");
        Assert.assertEquals(1, arrayList.size());
    }
    /**
     * Adding a large amount of items should not break the ArrayList.
     */
    @Test
    public void addTest2(){
        ArrayListImplementation<String> arrayList = new ArrayListImplementation<>();
        arrayList.add("item 1");
        arrayList.add("item 2");
        arrayList.add("item 3");
        arrayList.add("item 4");
        arrayList.add("item 5");
        arrayList.add("item 6");
        arrayList.add("item 7");
        arrayList.add("item 8");
        arrayList.add("item 9");
        arrayList.add("item 10");
        arrayList.add("item 11");
        arrayList.add("item 12");
        Assert.assertEquals(12, arrayList.size());
    }
    /**
     * Getting the item at index 0 should retrieve the first item.
     */
    @Test
    public void getTest1(){
        ArrayListImplementation<String> arrayList = new ArrayListImplementation<>();
        arrayList.add("item 1");
        String expected = "item 1";
        String actual = arrayList.get(0);
        Assert.assertEquals(expected, actual);
    }
    /**
     * Getting the item at index 1 should retrieve the second item.
     */
    @Test
    public void getTest2(){
        ArrayListImplementation<String> arrayList = new ArrayListImplementation<>();
        arrayList.add("item 1");
        arrayList.add("item 2");
        String expected = "item 2";
        String actual = arrayList.get(1);
        Assert.assertEquals(expected, actual);
    }
}
