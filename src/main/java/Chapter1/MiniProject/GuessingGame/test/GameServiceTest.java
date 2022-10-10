package Chapter1.MiniProject.GuessingGame.test;

import Chapter1.MiniProject.GuessingGame.main.GameService;
import org.junit.Assert;
import org.junit.Test;

public class GameServiceTest {


    /**
     * checkGuess(2.71) should return false if the secret number is 3.14.
     */
    @Test
    public void gameServiceTest1(){
        GameService gameService = new GameService();
        gameService.secretNumber = 3.14;
        double input = 2.71;
        boolean expected = false;
        boolean actual = gameService.checkGuess(input);
        Assert.assertEquals(expected,actual);
    }
    /**
     * checkGuess(3.14) should return true if the secret number is 3.14.
     */
    @Test
    public void gameServiceTest2(){
        GameService gameService = new GameService();
        gameService.secretNumber = 3.14;
        double input = 3.14;
        boolean expected = true;
        boolean actual = gameService.checkGuess(input);
        Assert.assertEquals(expected,actual);
    }

    /**
     * checkGuess(2.71) should return true if the secret number has been changed to 2.71.
     */
    @Test
    public void gameServiceTest3(){
        GameService gameService = new GameService();
        gameService.secretNumber = 2.71;
        double input = 3.14;
        boolean expected = false;
        boolean actual = gameService.checkGuess(input);
        Assert.assertEquals(expected,actual);
    }
}
