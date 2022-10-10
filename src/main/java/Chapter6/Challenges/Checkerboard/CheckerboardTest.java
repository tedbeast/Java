package Chapter6.Challenges.Checkerboard;

;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CheckerboardTest {
    public static Checkerboard ch;
    @BeforeClass
    public static void setUp(){
        ch = new Checkerboard();
    }
    @Test
    public void CheckerTest1(){
        int input = 2;
        int[] row1 = {0,1};
        int[] row2 = {1, 0};
        int[][] board = ch.createCheckerboard(input);
        Assert.assertArrayEquals(board[0], row1);
        Assert.assertArrayEquals(board[1], row2);
    }
    @Test
    public void CheckerTest2(){
        int input = 3;
        int[] row1 = {0,1,0};
        int[] row2 = {1,0,1};
        int[] row3 = {0,1,0};
        int[][] board = ch.createCheckerboard(input);
        Assert.assertArrayEquals(board[0], row1);
        Assert.assertArrayEquals(board[1], row2);
        Assert.assertArrayEquals(board[2], row3);
    }
}
