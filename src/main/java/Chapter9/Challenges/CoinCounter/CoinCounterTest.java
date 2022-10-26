package Chapter9.Challenges.CoinCounter;

import org.junit.Test;

public class CoinCounterTest {
    CoinCounter cc = new CoinCounter();

    /**
     * Using the coin values {1,5,10,25} to add up to 31, we need at least 3 coins. (25+10+1)
     */
    @Test
    public void coinCounterTest1(){
        int[] coins = {1,5,10,25};
        int value = 31;
        int expected = 3;
        int actual = cc.count(coins, value);
    }
    /**
     * Using the coin values {1,5,10,25} to add up to 19, we need at least 6 coins. (10+5+1+1+1+1)
     */
    @Test
    public void coinCounterTest2(){
        int[] coins = {1,5,10,25};
        int value = 19;
        int expected = 6;
        int actual = cc.count(coins, value);
    }
    /**
     * Using the coin values {3,6,8,10} to add up to 9, we need at least 2 coins. (6+3)
     */
    @Test
    public void coinCounterTest3(){
        int[] coins = {3,6,8,10};
        int value = 9;
        int expected = 2;
        int actual = cc.count(coins, value);
    }
    /**
     * Using the coin values {3,4,8,10,12} to add up to 18, we need at least 2 coins. (10+8)
     */
    @Test
    public void coinCounterTest4(){
        int[] coins = {3,4,8,10,12};
        int value = 18;
        int expected = 2;
        int actual = cc.count(coins, value);
    }
}
