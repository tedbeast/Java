package Chapter3.MiniProject.GroceryList.main;

import org.junit.Assert;

import java.util.Scanner;

public class GroceryMenu {
    /**
     * There is no need to change anything in this class. It does not affect the outcome of the test cases.
     * The purpose of this class is for you to interact with a functional Console Line menu, so that you can
     * see how your code works from the user's end.
     *
     * Unlike the previous mini-project, this leverages a switch case, while you can think of as a well-formatted
     * way to write a long set of if-else statements.
     */
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        GroceryService groceryService = new GroceryService();
        boolean shopping = true;
        while(shopping){
            System.out.println("Welcome to the grocery tracker, what would you like to do?");
            System.out.println("1: Add to the grocery list.");
            System.out.println("2: Check if some item is already on the grocery list.");
            System.out.println("3: Go shopping and clear the entire grocery list.");
            int choice = userInputScanner.nextInt();
//            there's a common bug with nextInt() that causes the following nextLine() to skip. we can avoid that here
            userInputScanner.nextLine();
            switch (choice){
                case 1:
//                    \n is a new line character, it's just used for formatting here.
                    System.out.println("\nenter the name of the item you'd like to add: ");
                    String item = userInputScanner.nextLine();
                    groceryService.addItem(item);
                    System.out.println("item added: "+item);
                    break;
                case 2:
                    System.out.println("enter the name of the item you'd like to check for: ");
                    item = userInputScanner.nextLine();
                    boolean present = groceryService.containsItem(item);
                    if(present){
                        System.out.println("That item is in the list.");
                    }else{
                        System.out.println("That item is not in the list.");
                    }
                    break;
                case 3:
                    groceryService.goShopping();
                    System.out.println("You went shopping and cleared the grocery list.");
                default:
                    System.out.println("Not a valid input.");

            }
        }

    }
}
