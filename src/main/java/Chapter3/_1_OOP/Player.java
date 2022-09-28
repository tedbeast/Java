package Chapter3._1_OOP;

import java.util.List;

/**
 * This class has two constructors, but currently the constructors have no behavior,
 * which causes the tests to fail.
 *
 * The first constructor should take in a player's name, and set the Player object's playerName to the parameter. Consider
 *  using the 'this' keyword do this. The constructor should also instantiate the player's inventory to a list object,
 *  and set the player's level to 1 by default.
 *
 * The second constructor will use a player's name and level to set the Player object's respective field and instantiate
 *  a new list.
 *
 * The player should also be able to add items to their inventory - however, only a String for title and double
 * for value are provided. You will have to write a constructor in inventoryItem, as well as instantiate new inventoryItems,
 * and add them to the inventory in the addItem method in Player.
 **/
public class Player {
    String playerName;
    int level;
    List<InventoryItem> inventory;

    public Player(String playerName){

    }

    public Player(String playerName, int level){

    }

    public void addItem(String title, double value){

    }
}
