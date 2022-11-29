package Chapter3.MiniProject.GroceryList.test;

import Chapter3.MiniProject.GroceryList.main.GroceryDAO;
import Chapter3.MiniProject.GroceryList.main.GroceryMain;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class GroceryRepositoryTest {
    GroceryDAO groceryDAO;
    /**
     * Run the same method used in the menu class to drop and recreate the Grocery table.
     * Also, generate a new GroceryDAO.
     */
    @Before
    public void setUp(){
        GroceryMain.databaseSetup();
        groceryDAO = new GroceryDAO();
    }

    /**
     * When the application starts, the grocery database should not contain any groceries.
     */
    @Test
    public void groceryListEmptyOnStartTest(){
        List<String> allGroceries = groceryDAO.getAllGroceries();
        boolean expected = false;
        boolean actual = allGroceries.isEmpty();
        Assert.assertEquals(expected, actual);
    }
    /**
     * When a grocery is added, the grocery database should contain the grocery.
     */
    @Test
    public void groceryListAddTest1(){
        groceryDAO.addGrocery("banana");
        List<String> allGroceries = groceryDAO.getAllGroceries();
        Assert.assertTrue(allGroceries.size() == 1);
        Assert.assertTrue(allGroceries.contains("banana"));
    }
    /**
     * When a grocery is added, the grocery database should contain the grocery.
     */
    @Test
    public void groceryListAddTest2(){
        groceryDAO.addGrocery("milk");
        groceryDAO.addGrocery("bread");
        groceryDAO.addGrocery("corn");
        List<String> allGroceries = groceryDAO.getAllGroceries();
        Assert.assertTrue(allGroceries.size() == 3);
        Assert.assertTrue(allGroceries.contains("milk"));
        Assert.assertTrue(allGroceries.contains("bread"));
        Assert.assertTrue(allGroceries.contains("corn"));
    }
}
