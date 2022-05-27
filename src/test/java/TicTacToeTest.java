
import Level2.TicTacToe.TicTacToe;
import org.junit.Assert;
import org.junit.Test;


public class TicTacToeTest {

    @Test
    public void testValidateWin1() {
        char[][] board = {{'X', 'X', 'X'}, {'O', 'X', 'O'}, {'O', 'O', 'X'}};
        Assert.assertEquals('X', new TicTacToe().validateWin(board));
    }

    @Test
    public void testValidateWin2() {
        char[][] board = {{'X', 'O', 'X'}, {'X', 'O', 'O'}, {'X', 'X', 'O'}};
        Assert.assertEquals('X', new TicTacToe().validateWin(board));
    }

    @Test
    public void testValidateWin3() {
        char[][] board = {{'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'O', 'O', 'X'}};
        Assert.assertEquals('X', new TicTacToe().validateWin(board));
    }

    @Test
    public void testValidateWin4() {
        char[][] board = {{'X', 'O', 'X'},
                {'O', 'O', 'O'},
                {'X', 'X', 'O'}};
        Assert.assertEquals('O', new TicTacToe().validateWin(board));
    }

    @Test
    public void testValidateWin5() {
        char[][] board = {{'X', 'O', 'O'},
                {'O', 'X', 'O'},
                {'X', 'X', 'O'}};
        Assert.assertEquals('O', new TicTacToe().validateWin(board));
    }

    @Test
    public void testValidateWin6() {
        char[][] board = {{'O', 'O', 'X'},
                {'O', 'O', 'X'},
                {'X', 'X', 'O'}};
        Assert.assertEquals('O', new TicTacToe().validateWin(board));
    }

    @Test
    public void testValidateWin7() {
        char[][] board = {{'X', 'O', 'X'},
                {'O', 'O', 'X'},
                {'X', 'X', 'O'}};
        Assert.assertEquals('T', new TicTacToe().validateWin(board));
    }
}