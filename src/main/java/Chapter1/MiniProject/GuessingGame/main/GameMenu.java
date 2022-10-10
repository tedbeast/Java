package Chapter1.MiniProject.GuessingGame.main;

import java.util.Scanner;

/**
 * There is no need to change anything in this class. It does not affect the outcome of the test cases.
 * The purpose of this class is for you to interact with a functional Console Line menu, so that you can
 * see how your code works from the user's end.
 */
public class GameMenu {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        GameService gameService = new GameService();
        boolean playing = true;
        System.out.println("It's time to start guessing the secret number, which is the first three digits of pi!");
        while(playing){
            System.out.println("Guess: ");
            double guessNumber = userInputScanner.nextDouble();
            boolean correct = gameService.checkGuess(guessNumber);
            if(correct){
                System.out.println("You got the secret number! Thanks for playing");
                playing = false;
            }else{
                System.out.println("Incorrect!");
            }
        }
    }
}
