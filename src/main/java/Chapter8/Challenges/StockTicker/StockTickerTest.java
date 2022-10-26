package Chapter8.Challenges.StockTicker;

import org.junit.Assert;
import org.junit.Test;

public class StockTickerTest {
    StockTicker st = new StockTicker();

    /**
     * given the prices {1,2,3,4,5}, the best time to buy is when the price is 1 (time 0) and the best time to sell
     * is when the price is 5 (time 4).
     */
    @Test
    public void stockTest1(){
        int[] input = {1,2,3,4,5};
        String expected = "Buy 0 Sell 4";
        String actual = st.getBuySellTimes(input);
        Assert.assertEquals(expected, actual);
    }
    /**
     * given the prices {5,4,3,4,2}, the best time to buy is when the price is 3 (time 2) and the best time to sell
     * is when the price is 4 (time 3).
     */
    @Test
    public void stockTest2(){
        int[] input = {5,4,3,4,2};
        String expected = "Buy 2 Sell 3";
        String actual = st.getBuySellTimes(input);
        Assert.assertEquals(expected, actual);
    }
    /**
     * given the prices {9,3,7,4,5,8,2}, the best time to buy is when the price is 3 (time 1) and the best time to sell
     * is when the price is 8 (time 5).
     */
    @Test
    public void stockTest3(){
        int[] input = {9,3,7,4,5,8,2};
        String expected = "Buy 1 Sell 5";
        String actual = st.getBuySellTimes(input);
        Assert.assertEquals(expected, actual);
    }
    /**
     * given the prices {6,9,3,2,1,5,6}, the best time to buy is when the price is 1 (time 4) and the best time to sell
     * is when the price is 6 (time 6).
     */
    @Test
    public void stockTest4(){
        int[] input = {6,9,3,2,1,5,6};
        String expected = "Buy 4 Sell 6";
        String actual = st.getBuySellTimes(input);
        Assert.assertEquals(expected, actual);
    }
    /**
     * given the prices {10,4,3,8,4,9,1,6}, the best time to buy is when the price is 3 (time 2) and the best time to
     * sell is when the price is 9 (time 5).
     */
    @Test
    public void stockTest5(){
        int[] input = {10,4,3,8,4,9,1,6};
        String expected = "Buy 2 Sell 5";
        String actual = st.getBuySellTimes(input);
        Assert.assertEquals(expected, actual);
    }
}
