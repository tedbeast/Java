package Chapter1.MiniProject.GuessingGame.main;

public class GameService {
    /**
     * This variable represents a secret number. This variable can be referenced anywhere within the GameService class.
     */
    public double secretNumber;

    /**
     * A constructor that will create a GameService object and set the secretNumber variable to 3.14.
     */
    public GameService(){
        secretNumber = 3.14;
    }

    /**
     *
     * @param guessNumber the number that the user has input into their console.
     * @return true if guessNumber is equal to the secretNumber, false otherwise.
     */
    public boolean checkGuess(double guessNumber) {
        return false;
    }
}