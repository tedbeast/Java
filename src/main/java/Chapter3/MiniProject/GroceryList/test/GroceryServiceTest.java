package Chapter3.MiniProject.GroceryList.test;

import Chapter3.MiniProject.GroceryList.main.GroceryMenu;
import Chapter3.MiniProject.GroceryList.main.GroceryService;
import org.junit.Assert;
import org.junit.Test;

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

    /**
     * When items are added via GroceryService, they should be contained by the GroceryService.
     * When goShopping is called, the items added to GroceryService should no longer be in the GroceryService.
     */
    @Test
    public void shoppingTest1(){
        GroceryService gs = new GroceryService();
        gs.addItem("milk");
        gs.addItem("bread");
        gs.addItem("bacon");
        Assert.assertTrue(gs.containsItem("milk"));
        Assert.assertTrue(gs.containsItem("bread"));
        Assert.assertTrue(gs.containsItem("bacon"));
        gs.goShopping();

        Assert.assertFalse(gs.containsItem("milk"));
        Assert.assertFalse(gs.containsItem("bread"));
        Assert.assertFalse(gs.containsItem("bacon"));
    }
}
