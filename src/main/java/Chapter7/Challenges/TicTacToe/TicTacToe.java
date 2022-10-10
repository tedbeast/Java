package Chapter7.Challenges.TicTacToe;
/*
task: tell if a player has one a game of tic-tac-toe. see test cases for formatting.
 */

public class TicTacToe {
    public char validateWin(char[][] board) {
        /*
        sure, we could just manually check every win condition:
        my issue with this is that if we just predefine win conditions, then we've limited
        our functionality -

        in the future, i'll write test cases for 4x4 and 5x5 tic tac toe board, which changes
        things..

        we can thing of this as having not 8 win conditions, but 3-4 win patterns (depending
        on if you count the diagonals separately)
        so.. you could use for loops to check all vertical columns for wins,
        horizontal columns for wins,
        and diagonals for wins

        the issue isn't efficiency so much as scalability
         */
        return ' ';
    }
}
