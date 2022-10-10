package Chapter3.MiniProject.GroceryList.main;

import java.util.ArrayList;
import java.util.List;

/**
 * The GroceryService needs a way to keep track of any number of grocery items.
 * Grocery items will be stored here as Strings.
 */
public class GroceryService {
    private List<String> groceryItems;

    /**
     * Instantiate a new GroceryService.
     * Currently this class has a field we could use to store grocery items, but it has not been instantiated.
     */
    public GroceryService(){
        groceryItems = new ArrayList<>();
    }

    /**
     * add an item to groceryList.
     * @param item the String representing the grocery item to be added.
     */
    public void addItem(String item){

    }

    /**
     * @return true if groceryItems contains a certain grocery item name, false otherwise.
     * it is recommended to use .equals() when checking if an object is equivalent to another object.
     * this is because comparisons between objects are actually comparing their reference address, not the object.
     */
    public boolean containsItem(String item){
        return false;
    }

    /**
     * clear the groceryList - remove all items.
     */
    public void goShopping(){

    }


}
