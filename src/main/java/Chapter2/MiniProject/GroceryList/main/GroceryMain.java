package Chapter2.MiniProject.GroceryList.main;

import Util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
/**
 * There is no need to change anything in this class.
 * It does not affect the outcome of the test cases.
 * You can, however, run this class to play with a CLI menu that interacts with the code you write in
 * GroceryService and GroceryRepository.
 */
public class GroceryMain {

    public static void main(String[] args) {
        GroceryService groceryService = new GroceryService();
        databaseSetup();
        boolean active = true;
        while(active) {
            System.out.println("What would you like to do?" +
                    "\n 1: Try to add a grocery item." +
                    "\n 2: Check if a grocery item is already in the grocery list." +
                    "\n 3: See all the groceries."+
                    "\n 4: Quit");
            Scanner inputScanner = new Scanner(System.in);
            int inputSelection = inputScanner.nextInt();
            inputScanner.nextLine();
            switch (inputSelection) {
                case 1:
                    System.out.println("What grocery would you like to add?");
                    String grocery = inputScanner.nextLine();
                    groceryService.addItem(grocery);
                    break;
                case 2:
                    System.out.println("What grocery would you like to check for?");
                    grocery = inputScanner.nextLine();
                    if (groceryService.containsItem(grocery)) {
                        System.out.println("That grocery is already in the list.");
                    } else {
                        System.out.println("That grocery is not in the list.");
                    }
                    break;
                case 3:
                    System.out.println("Here are all the groceries: ");
                    groceryService.getAllGroceries();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    active = false;
                    break;
            }
        }
    }

    /**
     * For the purpose of this short exercise, this method will destroy and set up a new grocery table.
     * This is not a normal way to set up your tables, in your actual projects you should set up your database
     * schema in a SQL editor such as DBeaver or DataGrip.
     */
    public static void databaseSetup(){
        try {
            Connection conn = ConnectionUtil.getConnection();
            PreparedStatement ps1 = conn.prepareStatement("drop table if exists grocery");
            ps1.executeUpdate();
            PreparedStatement ps2 = conn.prepareStatement("create table grocery(grocery_name varchar(255))");
            ps2.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
