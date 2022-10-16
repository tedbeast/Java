package Chapter5.Challenges.Search2dArray;

import org.junit.Test;

public class Search2dArrayTest {
    Search2dArray sat = new Search2dArray();

    /**
     * The 2d array here contains 2, so search should return true.
     */
    @Test
    public void searchTest1(){
        int[][] input =
                {
                        {0,1,2},
                        {2,3,4},
                        {5,6,7}
                };
        int target = 2;
        boolean expected = true;
        boolean actual = sat.search(input,target);
    }
    /**
     * The 2d array here contains 5, so search should return true.
     */
    @Test
    public void searchTest2(){
        int[][] input =
                {
                        {0,1,2},
                        {2,3,4},
                        {5,6,7}
                };
        int target = 5;
        boolean expected = true;
        boolean actual = sat.search(input,target);
    }
    /**
     * The 2d array here contains 8, so search should return true.
     */
    @Test
    public void searchTest3(){
        int[][] input =
                {
                        {4,8,9,3},
                        {7,3,8,2}
                };
        int target = 8;
        boolean expected = true;
        boolean actual = sat.search(input,target);
    }
    /**
     * The 2d array here does not contain 0, so search should return false.
     */
    @Test
    public void searchTest4(){
        int[][] input =
                {
                        {4,8,9,3},
                        {7,3,8,2}
                };
        int target = 0;
        boolean expected = false;
        boolean actual = sat.search(input,target);
    }
    /**
     * The 2d array here does not contain 10, so search should return false.
     */
    @Test
    public void searchTest5(){
        int[][] input =
                {
                        {9,3,6,8,4,2,5},
                        {3,5,7,9,4,3,9},
                        {3,2,6,9,6,4,0}
                };
        int target = 10;
        boolean expected = false;
        boolean actual = sat.search(input,target);
    }
}
