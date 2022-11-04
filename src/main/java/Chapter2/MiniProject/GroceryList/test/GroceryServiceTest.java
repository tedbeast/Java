package Chapter2.MiniProject.GroceryList.test;

import Chapter2.MiniProject.GroceryList.main.GroceryService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GroceryServiceTest {
    /**
     * a GroceryService should not contain items that it does not contain.
     */
    @Test
    public void containsTest1(){
        GroceryService gs = new GroceryService();
        boolean expected = false;
        boolean actual = gs.containsItem("milk");
        Assert.assertEquals(expected, actual);
    }

    /**
     * A GroceryService should contain items that have been added to the GroceryService.
     */
    @Test
    public void addTest1(){
        GroceryService gs = new GroceryService();
        gs.addItem("milk");
        boolean expected = true;
        boolean actual = gs.containsItem("milk");
        Assert.assertEquals(expected, actual);
    }
    /**
     * A GroceryService should not contain items that have not been added to the GroceryService.
     */
    @Test
    public void addTest2(){
        GroceryService gs = new GroceryService();
        gs.addItem("bread");
        gs.addItem("bacon");
        Assert.assertTrue(gs.containsItem("bread"));
        Assert.assertTrue(gs.containsItem("bacon"));
        Assert.assertFalse(gs.containsItem("milk"));
    }

    @Test
    public void getAllGroceriesTest1(){
        GroceryService gs = new GroceryService();
        gs.addItem("bread");
        gs.addItem("bacon");
        List<String> groceryList = gs.getAllGroceries();
        Assert.assertTrue(groceryList.contains("bread"));
        Assert.assertTrue(groceryList.contains("bacon"));
    }

    /**
     * A GroceryService should not permit the same item to be added twice.
     */
    @Test
    public void addTest3(){
        GroceryService gs = new GroceryService();
        gs.addItem("bread");
        gs.addItem("bread");
        Assert.assertTrue(gs.containsItem("bread"));
        List<String> groceryList = gs.getAllGroceries();
        groceryList.remove(0);
        Assert.assertFalse(gs.containsItem("bread"));
    }
}
