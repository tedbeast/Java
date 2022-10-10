package Chapter7.Challenges.StockTicker;

import org.junit.Assert;
import org.junit.Test;

public class StockTickerTest {
    StockTicker st = new StockTicker();
    @Test
    public void stockTest1(){
        int[] input = {1,2,3,4,5};
        String expected = "Buy 0 Sell 4";
        String actual = st.getBuySellTimes(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void stockTest2(){
        int[] input = {5,4,3,4,2};
        String expected = "Buy 2 Sell 3";
        String actual = st.getBuySellTimes(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void stockTest3(){
        int[] input = {9,3,7,4,5,8,2};
        String expected = "Buy 1 Sell 4";
        String actual = st.getBuySellTimes(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void stockTest4(){
        int[] input = {6,9,3,2,1,5,6};
        String expected = "Buy 4 Sell 6";
        String actual = st.getBuySellTimes(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void stockTest5(){
        int[] input = {10,4,3,8,4,9,1,6};
        String expected = "Buy 2 Sell 5";
        String actual = st.getBuySellTimes(input);
        Assert.assertEquals(expected, actual);
    }
}
