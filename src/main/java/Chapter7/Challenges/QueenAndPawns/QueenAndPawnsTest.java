package Chapter7.Challenges.QueenAndPawns;

import org.junit.Assert;
import org.junit.Test;

public class QueenAndPawnsTest {
    QueenAndPawns q = new QueenAndPawns();
    @Test
    public void queenTest1(){
        char[][] input = {
                {'p', ' '},
                {' ', 'q'}

        };
        int expected = 2;
        int actual = q.countMoves(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void queenTest2(){
        char[][] input = {
                {' ', ' ', ' '},
                {'p', 'q', 'p'},
                {' ', ' ', ' '}

        };
        int expected = 6;
        int actual = q.countMoves(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void queenTest3(){
        char[][] input = {
                {'q', ' ', 'p'},
                {' ', ' ', 'p'},
                {' ', ' ', ' '}

        };
        int expected = 5;
        int actual = q.countMoves(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void queenTest4(){
        char[][] input = {
                {' ', 'p', ' ', 'q'},
                {' ', 'p', ' ', ' '},
                {' ', ' ', ' ', ' '},
                {' ', 'p', ' ', 'p'}
        };
        int expected = 6;
        int actual = q.countMoves(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void queenTest5(){
        char[][] input = {
                {' ', ' ', ' ', ' '},
                {'p', ' ', 'q', ' '},
                {'p', ' ', ' ', ' '},
                {' ', ' ', ' ', ' '}
        };
        int expected = 10;
        int actual = q.countMoves(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void queenTest6(){
        char[][] input = {
                {'p', ' ', ' ', ' '},
                {'p', ' ', ' ', ' '},
                {'q', 'p', 'p', ' '},
                {' ', ' ', ' ', ' '}
        };
        int expected = 4;
        int actual = q.countMoves(input);
        Assert.assertEquals(expected, actual);
    }
}
