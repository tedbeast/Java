package Chapter7.Challenges.IsSubset;

import org.junit.Before;
import org.junit.Test;

public class IsSubsetTest {
    IsSubset is;
    @Before
    public void setUp(){
        is = new IsSubset();
    }
    /**
     * {2,3,4} is a valid subset of {1,2,3,4,5}.
     */
    @Test
    public void IsSubsetTest1(){
        int[] arr = {1,2,3,4,5};
        int[] subset = {2,3,4};
        boolean expected = true;
        boolean actual = is.checkSubset(arr,subset);
    }
    /**
     * {5,2,3,7} is a valid subset of {2,4,3,7,9,1,5}.
     */
    @Test
    public void IsSubsetTest2(){
        int[] arr = {2,4,3,7,9,1,5};
        int[] subset = {5,2,3};
        boolean expected = true;
        boolean actual = is.checkSubset(arr,subset);
    }
    /**
     * {5,2,8,7,0} is not a valid subset of {2,4,3,7,9,1,5}.
     */
    @Test
    public void IsSubsetTest3(){
        int[] arr = {2,4,3,7,9,1,5};
        int[] subset = {5,2,8,7,0};
        boolean expected = false;
        boolean actual = is.checkSubset(arr,subset);
    }
    /**
     * {5,2,3,7} is not a valid subset of {9,0,1,4,6}.
     */
    @Test
    public void IsSubsetTest4(){
        int[] arr = {9,0,1,4,6};
        int[] subset = {5,2,3,7};
        boolean expected = false;
        boolean actual = is.checkSubset(arr,subset);
    }
}
