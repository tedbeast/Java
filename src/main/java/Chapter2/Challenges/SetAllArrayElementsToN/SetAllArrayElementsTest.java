package Chapter2.Challenges.SetAllArrayElementsToN;

import org.junit.Assert;
import org.junit.Test;

public class SetAllArrayElementsTest {
    public SetAllArrayElements saae = new SetAllArrayElements();

    /**
     * Given some array arr as {1,2,3,4} and int n as 0, calling saae.set(arr,n) should change arr to {0,0,0,0}.
     */
    @Test
    public void setTest1(){
        int[] arr = {1,2,3,4};
        int n = 0;
        int[] expected = {0,0,0,0};
        saae.set(arr,n);
        Assert.assertArrayEquals(expected,arr);
    }
    /**
     * Given some array arr as {2,2,2,2,2} and int n as 1, calling saae.set(arr,n) should change arr to {1,1,1,1,1}.
     */
    @Test
    public void setTest2(){
        int[] arr = {2,2,2,2,2};
        int n = 1;
        int[] expected = {1,1,1,1,1};
        saae.set(arr,n);
        Assert.assertArrayEquals(expected,arr);
    }
}
