package Chapter2.MiniProject.GroceryList.main;

import java.util.List;

/**
 * The GroceryService needs a way to keep track of any number of grocery items.
 * Grocery items will be stored here as Strings.
 */
public class GroceryService {
    GroceryDAO groceryDAO;
    /**
     * There is no need to modify this constructor, it already works.
     * Instantiate a new GroceryService and instantiates its GroceryRepository as well.
     */
    public GroceryService(){
        groceryDAO = new GroceryDAO();
    }
    /**
     * TODO: Use the GroceryRepository to retrieve a list of all the groceries from the database.
     * @return all the groceries.
     */
    public List<String> getAllGroceries() {
        return null;
    }
    /**
     * TODO: Use the GroceryRepository to a grocery to the database.
     * however, it should first check if the database already contains the item - in order to avoid duplicates.
     * If there are duplicates in the grocery list, this method will fail a test.
     * @param item the String representing the grocery item to be added.
     */
    public void addItem(String item){
    }
    /**
     * TODO: Check if the database already contains a grocery.
     * @return true if the grocery database contains a certain grocery item name, false otherwise.
     * it is recommended to use .equals() when checking if an object is equivalent to another object.
     * this is because comparisons between objects are actually comparing their reference address, not the object.
     */
    public boolean containsItem(String item){
        return false;
    }
}
