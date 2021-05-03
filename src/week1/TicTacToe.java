class Solution {

    int[] count(String[] board) {
        int[] c = {0, 0};
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(board[i].charAt(j) == 'X')
                    c[0]++;
                else if(board[i].charAt(j) == 'O')
                    c[1]++;
            }
        }
        return c;
    }

    boolean rowWin(int t, String[] board, char c) {
        if(t < 0)
            return false;
        else if((board[t].charAt(0) == c && board[t].charAt(1) == c && board[t].charAt(2) == c))
            return true;
        else
            return rowWin(t - 1, board, c);
    }

    boolean colWin(int t, String[] board, char c) {
        if(t < 0)
            return false;
        else if((board[0].charAt(t) == c && board[1].charAt(t) == c && board[2].charAt(t) == c))
            return true;
        else
            return colWin(t - 1, board, c);
    }

    boolean diagonalWin(String[] board, char c) {
        if((board[0].charAt(0) == c && board[1].charAt(1) == c && board[2].charAt(2) == c))
            return true;
        else
            return board[2].charAt(0) == c && board[1].charAt(1) == c && board[0].charAt(2) == c;
    }

    boolean isWinner(char c, String[] board) {
        return rowWin(2, board, c) || colWin(2, board, c) || diagonalWin(board, c);
    }

    public boolean validTicTacToe(String[] board) {
        int[] counter = count(board);
        int countX = counter[0], countO = counter[1];
        int diff = countX - countO;

        if(diff != 0 && diff != 1)
            return false;
        else if(diff == 0 && isWinner('X', board) )
            return false;
        else if(diff == 1 && isWinner('O', board) )
            return true;

        return true;
    }
}

public class TicTacToe {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.validTicTacToe(new String[]{"OXO", "XOX", "OXO"}));
    }
}