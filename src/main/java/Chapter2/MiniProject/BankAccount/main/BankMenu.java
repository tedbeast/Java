package Chapter2.MiniProject.BankAccount.main;

import java.util.Scanner;

/**
 * There is no need to change anything in this class. It does not affect the outcome of the test cases.
 * The purpose of this class is for you to interact with a functional Console Line menu, so that you can
 * see how your code works from the user's end.
 */
public class BankMenu {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        BankService bankService = new BankService();
        boolean banking = true;
        while(banking){
            System.out.println("Welcome to the bank! Please select what you'd like to do:");
            System.out.println("1. deposit");
            System.out.println("2. withdraw");
            System.out.println("3. view balance");
            System.out.println("4. exit");
            int userChoice = userInputScanner.nextInt();
            if(userChoice == 1){
                double amount = userInputScanner.nextDouble();
                bankService.deposit(amount);
            }else if(userChoice == 2){
                double amount = userInputScanner.nextDouble();
                bankService.withdraw(amount);
            }else if(userChoice == 3){
                double balance = bankService.getBalance();
                System.out.println("You have: "+balance);
            }else if(userChoice == 4){
                System.out.println("Thanks for visiting the bank");
                banking = false;
            }
        }
    }
}
