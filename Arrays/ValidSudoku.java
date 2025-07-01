package Arrays;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        // check row
        for (int i=0; i < 9; i++) {
            char[] row = board[i];
            if (isValidSudoku(row) == false)
                return false;
        }
        // check column
        for (int i=0; i < 9; i++) {
            char[] col = new char[9];
            for (int j=0; j < 9; j++) {
                col[j] = board[j][i];
            }
            if (isValidSudoku(col) == false)
                return false;
        }
        // check sub
        for (int i_sub = 0; i_sub < 3; i_sub++) {
            for (int j_sub = 0; j_sub < 3; j_sub++) {
                char[] sub = new char[9];
                int k = 0;
                for (int i=i_sub*3; i < 3 + i_sub*3; i++) {
                    for (int j=j_sub*3; j < 3+j_sub*3; j++) {
                        sub[k] = board[i][j];
                        k++;
                    }
                }
                if (isValidSudoku(sub) == false)
                        return false;
            }
        }
        return true;
    }
    public static boolean isValidSudoku(char[] nums) {
        int[] freq = new int[10];
        for (int j = 0 ; j < nums.length; j++) {
            int num = Character.getNumericValue(nums[j]);
            if (num == -1) continue;
            if (freq[num] != 0) {
               return false; 
            }
            freq[num] = 1;
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] board = { {'5','3','.','.','7','.','.','.','.'}
,{'6','.','.','1','9','5','.','.','.'}
,{'.','9','8','.','.','.','.','6','.'}
,{'8','.','.','.','6','.','.','.','3'}
,{'4','.','.','8','.','3','.','.','1'}
,{'7','.','.','.','2','.','.','.','6'}
,{'.','6','.','.','.','.','2','8','.'}
,{'.','.','.','4','1','9','.','.','5'}
,{'.','.','.','.','8','.','.','7','9'}} ;
    System.out.println(isValidSudoku(board));
    }
}
