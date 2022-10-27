package Chapter9.Challenges.GridSearch;

import org.junit.Assert;
import org.junit.Test;

public class GridSearchTest {
    GridSearch gs = new GridSearch();

    /**
     * there is a valid path between a and b here.
     */
    @Test
    public void searchTest1(){
        char[][] input =
                {
                        {'a', ' ', ' ', ' '},
                        {' ', ' ', ' ', ' '},
                        {' ', ' ', ' ', ' '},
                        {' ', ' ', ' ', 'b'}
                };
        boolean expected = true;
        boolean actual = gs.search(input);
        Assert.assertEquals(expected,actual);
    }

    /**
     * there is no valid path between a and b here.
     */
    @Test
    public void searchTest2(){
        char[][] input =
                {
                        {'a', 'x', ' ', ' '},
                        {' ', 'x', ' ', ' '},
                        {' ', 'x', ' ', ' '},
                        {' ', 'x', ' ', 'b'}
                };
        boolean expected = false;
        boolean actual = gs.search(input);
        Assert.assertEquals(expected,actual);
    }

    /**
     * there is a valid path between a and b here, across the bottom of the board.
     */
    @Test
    public void searchTest3(){
        char[][] input =
                {
                        {' ', 'x', ' ', ' '},
                        {'a', 'x', 'b', ' '},
                        {' ', 'x', 'x', ' '},
                        {' ', ' ', ' ', ' '}
                };
        boolean expected = true;
        boolean actual = gs.search(input);
        Assert.assertEquals(expected,actual);
    }

    /**
     * there is a valid path between a and b here.
     */
    @Test
    public void searchTest4(){
        char[][] input =
                {
                        {' ', 'x', ' ', ' ', ' '},
                        {' ', 'x', 'b', 'x', ' '},
                        {'a', 'x', 'x', 'x', ' '},
                        {' ', ' ', ' ', ' ', ' '},
                        {'x', 'x', 'x', 'x', 'x'}
                };
        boolean expected = true;
        boolean actual = gs.search(input);
        Assert.assertEquals(expected,actual);
    }

    /**
     * there is a valid path between and b here.
     */
    @Test
    public void searchTest5(){
        char[][] input =
                {
                        {' ', ' ', ' ', ' ', ' '},
                        {' ', 'x', ' ', 'x', ' '},
                        {'a', 'x', 'x', 'x', ' '},
                        {' ', 'x', ' ', 'x', 'b'},
                        {'x', 'x', 'x', 'x', 'x'}
                };
        boolean expected = true;
        boolean actual = gs.search(input);
        Assert.assertEquals(expected,actual);
    }

    /**
     * there is no valid path between a and b here.
     */
    @Test
    public void searchTest6(){
        char[][] input =
                {
                        {' ', ' ', ' ', 'x', ' '},
                        {' ', 'x', ' ', 'x', ' '},
                        {'a', 'x', 'x', 'x', ' '},
                        {' ', 'x', ' ', 'x', 'b'},
                        {'x', 'x', 'x', 'x', 'x'}
                };
        boolean expected = false;
        boolean actual = gs.search(input);
        Assert.assertEquals(expected,actual);
    }
}
