package LeetCode;

/**
 * Created by vikram on 25/11/16.
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

 The Sudoku board could be partially filled, where empty cells are filled with the character '.'.

 A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
 */
public class ValidSudoku {


    public boolean isValidSudoku(char[][] board) {

        if (board == null || board.length != 9 || board[0].length != 9)
            return false;

        for (int i=0;i<board.length;i++)
        {
            int[] checker= new int[9];
            for (int j=0;j<board.length;j++)
            {
                if (board[i][j]!='.'){
                    int num=(int)board[i][j]-48;

                    if (checker[num-1]==1)
                        return false;
                    else checker[num-1]=1;}
            }
        }

        for (int j=0;j<board.length;j++)
        {
            int[] checker= new int[9];
            for (int i=0;i<board.length;i++)
            {
                if (board[i][j]!='.'){
                    int num=(int)board[i][j]-48;

                    if (checker[num-1]==1)
                        return false;
                    else checker[num-1]=1;}
            }
        }


        //check each 3*3 matrix
        for (int block = 0; block < 9; block++) {
            boolean[] m = new boolean[9];
            for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
                for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
                    if (board[i][j] != '.') {
                        if (m[(int) (board[i][j] - '1')]) {
                            return false;
                        }
                        m[(int) (board[i][j] - '1')] = true;
                    }
                }
            }
        }

        return true;





    }


}
