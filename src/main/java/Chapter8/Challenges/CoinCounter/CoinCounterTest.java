package Chapter8.Challenges.CoinCounter;

import org.junit.Test;

public class CoinCounterTest {
    CoinCounter cc = new CoinCounter();
    @Test
    public void coinCounterTest1(){
        int[] coins = {1,5,10,25};
        int value = 31;
        int expected = 3;
        int actual = cc.count(coins, value);
    }
    @Test
    public void coinCounterTest2(){
        int[] coins = {1,5,10,25};
        int value = 19;
        int expected = 6;
        int actual = cc.count(coins, value);
    }
    @Test
    public void coinCounterTest3(){
        int[] coins = {3,6,8,10};
        int value = 9;
        int expected = 2;
        int actual = cc.count(coins, value);
    }
    @Test
    public void coinCounterTest4(){
        int[] coins = {3,4,8,10,12};
        int value = 18;
        int expected = 2;
        int actual = cc.count(coins, value);
    }
}
