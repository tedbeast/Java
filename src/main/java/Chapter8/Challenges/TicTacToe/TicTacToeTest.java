package Chapter8.Challenges.TicTacToe;

;
import org.junit.Assert;
import org.junit.Test;


public class TicTacToeTest {

    /**
     * given the board
     * XXX
     * OXO
     * OOX
     *
     * the winner is X.
     */
    @Test
    public void testValidateWin1() {
        char[][] board = {{'X', 'X', 'X'}, {'O', 'X', 'O'}, {'O', 'O', 'X'}};
        Assert.assertEquals('X', new TicTacToe().validateWin(board));
    }
    /**
     * given the board
     * XOX
     * XOO
     * XXO
     *
     * the winner is X.
     */
    @Test
    public void testValidateWin2() {
        char[][] board = {{'X', 'O', 'X'}, {'X', 'O', 'O'}, {'X', 'X', 'O'}};
        Assert.assertEquals('X', new TicTacToe().validateWin(board));
    }
    /**
     * given the board
     * XOX
     * OXO
     * OOX
     *
     * the winner is X.
     */
    @Test
    public void testValidateWin3() {
        char[][] board = {{'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'O', 'O', 'X'}};
        Assert.assertEquals('X', new TicTacToe().validateWin(board));
    }
    /**
     * given the board
     * XOX
     * OOO
     * XXO
     *
     * the winner is O.
     */
    @Test
    public void testValidateWin4() {
        char[][] board = {{'X', 'O', 'X'},
                {'O', 'O', 'O'},
                {'X', 'X', 'O'}};
        Assert.assertEquals('O', new TicTacToe().validateWin(board));
    }
    /**
     * given the board
     * XOO
     * OXO
     * XXO
     *
     * the winner is O.
     */
    @Test
    public void testValidateWin5() {
        char[][] board = {{'X', 'O', 'O'},
                {'O', 'X', 'O'},
                {'X', 'X', 'O'}};
        Assert.assertEquals('O', new TicTacToe().validateWin(board));
    }
    /**
     * given the board
     * OOX
     * OOX
     * XXO
     *
     * the winner is O.
     */
    @Test
    public void testValidateWin6() {
        char[][] board = {{'O', 'O', 'X'},
                {'O', 'O', 'X'},
                {'X', 'X', 'O'}};
        Assert.assertEquals('O', new TicTacToe().validateWin(board));
    }
    /**
     * given the board
     * XOX
     * OOX
     * XXO
     *
     * the game is a tie.
     */
    @Test
    public void testValidateWin7() {
        char[][] board = {{'X', 'O', 'X'},
                {'O', 'O', 'X'},
                {'X', 'X', 'O'}};
        Assert.assertEquals('T', new TicTacToe().validateWin(board));
    }

    /**
     * Given the board
     * OOX
     * OOX
     * XXO
     *
     * The game is a tie.
     */
    @Test
    public void testValidateWin8() {
        char[][] board = {{'O', 'O', 'X'},
                {'O', 'O', 'X'},
                {'X', 'X', 'O'}};
        Assert.assertEquals('O', new TicTacToe().validateWin(board));
    }

    /**
     * Given the board
     * XOXO
     * OXOX
     * OXOX
     * XOXO
     *
     * the game is a tie.
     */
    @Test
    public void testValidateWin9() {
        char[][] board =    {{'X', 'O', 'X', 'O'},
                            {'O', 'X', 'O', 'X'},
                            {'O', 'X', 'O', 'X'},
                            {'X', 'O', 'X', 'O'}};
        Assert.assertEquals('T', new TicTacToe().validateWin(board));
    }

    /**
     * Given the board
     * XOXO
     * OXOX
     * OXXX
     * OOXX
     *
     * the winner is X.
     */
    @Test
    public void testValidateWin10() {
        char[][] board =    {{'X', 'O', 'X', 'O'},
                            {'O', 'X', 'O', 'O'},
                            {'O', 'X', 'X', 'X'},
                            {'O', 'O', 'X', 'X'}};
        Assert.assertEquals('X', new TicTacToe().validateWin(board));
    }

    /**
     * Given the board
     * XOXOO
     * OXOOO
     * OXXXO
     * OOXXO
     * XOXXO
     *
     * the winner is O.
     */
    @Test
    public void testValidateWin11() {
        char[][] board =    {
                            {'X', 'O', 'X', 'O', 'O'},
                            {'O', 'X', 'O', 'O', 'O'},
                            {'O', 'X', 'X', 'X', 'O'},
                            {'O', 'O', 'X', 'X', 'O'},
                            {'X', 'O', 'X', 'X', 'O'}
        };
        Assert.assertEquals('O', new TicTacToe().validateWin(board));
    }
}