package Chapter3._0_OOP.Constructors;

import java.util.List;

/*
This class has two constructors (which allow the test class to compile), but the constructors have no behavior,
which causes the tests to fail.
The test classes are expecting a constructor that takes in the player's name and sets it, which setting
the int level to 1 and inventory to a blank arrayList (not null).

The second constructor will take in the name and their starting level, and create a blank arrayList.

The player should also be able to add items to their inventory - however, only a String for title and double
for value are provided. You will have to write a constructor in inventoryItem, as well as instantiate new inventoryItems,
and add them to the inventory in the addItem method in Player.
 */
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
