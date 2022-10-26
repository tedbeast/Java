package Chapter8.Challenges.Queen;

import org.junit.Assert;
import org.junit.Test;

public class QueenTest {
    Queen q = new Queen();

    /**
     * On this board, the queen could make 3 moves.
     */
    @Test
    public void queenTest1(){
        char[][] input = {
                {' ', ' '},
                {' ', 'q'}

        };
        int expected = 3;
        int actual = q.countMoves(input);
        Assert.assertEquals(expected, actual);
    }

    /**
     * On this board, the queen could make 8 moves.
     */
    @Test
    public void queenTest2(){
        char[][] input = {
                {' ', ' ', ' '},
                {' ', 'q', ' '},
                {' ', ' ', ' '}

        };
        int expected = 8;
        int actual = q.countMoves(input);
        Assert.assertEquals(expected, actual);
    }

    /**
     * On this board, the queen could make 6 moves.
     */
    @Test
    public void queenTest3(){
        char[][] input = {
                {'q', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}

        };
        int expected = 6;
        int actual = q.countMoves(input);
        Assert.assertEquals(expected, actual);
    }

    /**
     * On this board, the queen could make 9 moves.
     */
    @Test
    public void queenTest4(){
        char[][] input = {
                {' ', ' ', ' ', 'q'},
                {' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' '}
        };
        int expected = 9;
        int actual = q.countMoves(input);
        Assert.assertEquals(expected, actual);
    }

    /**
     * On this board, the queen could make 11 moves.
     */
    @Test
    public void queenTest5(){
        char[][] input = {
                {' ', ' ', ' ', ' '},
                {' ', ' ', 'q', ' '},
                {' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' '}
        };
        int expected = 11;
        int actual = q.countMoves(input);
        Assert.assertEquals(expected, actual);
    }

    /**
     * On this board, the queen could make 9 moves.
     */
    @Test
    public void queenTest6(){
        char[][] input = {
                {' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' '},
                {'q', ' ', ' ', ' '},
                {' ', ' ', ' ', ' '}
        };
        int expected = 9;
        int actual = q.countMoves(input);
        Assert.assertEquals(expected, actual);
    }
}
