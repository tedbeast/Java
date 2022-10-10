package Chapter5.Challenges.CharComparison;

import org.junit.Assert;
import org.junit.Test;

public class CharComparisonTest {
    CharComparison cc = new CharComparison();
    @Test
    public void charCompareTest1(){
        char[] input1 = {'c', 'a', 't'};
        char[] input2 = {'d', 'o', 'g'};
        int expected = -1;
        int actual = cc.compare(input1, input2);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void charCompareTest2(){
        char[] input1 = {'m', 'o', 'u', 's', 'e'};
        char[] input2 = {'d', 'o', 'g'};
        int expected = 1;
        int actual = cc.compare(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void charCompareTest3(){
        char[] input1 = {'m', 'o', 'u', 's', 'e'};
        char[] input2 = {'m', 'o', 'u', 's', 'e'};
        int expected = 0;
        int actual = cc.compare(input1, input2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void charCompareTest4(){
        char[] input1 = {'d', 'o', 't'};
        char[] input2 = {'d', 'o', 'g'};
        int expected = 1;
        int actual = cc.compare(input1, input2);
        Assert.assertEquals(expected, actual);

    }
}
