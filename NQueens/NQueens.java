package NQueens;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {

    }

    void solve(int col, List<String> board, List<List<String>> ans, int n){
        if(col==n){
            ans.add(board);
            return;
        }
        for(int row=0;row!=n;row++){
            if(isSafe(row,col, board, n)){
                board.get(row) = ""

            }
        }

    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<List<String>>();
        List<String> board = new ArrayList<String>(n);
        String s = "....";
        for (int i = 0; i != n; i++) {
            board.add(i, s);
        }
        solve(0, board, ans, n);
        return ans;
    }
}
