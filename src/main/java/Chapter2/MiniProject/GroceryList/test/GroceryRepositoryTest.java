package Chapter2.MiniProject.GroceryList.test;

import Chapter2.MiniProject.GroceryList.main.GroceryMain;
import org.junit.Before;

public class GroceryRepositoryTest {
    /**
     * Run the same method used in the menu class to drop and recreate the Grocery table.
     */
    @Before
    public void setUp(){
        GroceryMain.databaseSetup();
    }
}
