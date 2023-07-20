import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {
    public static void main(String[] args) {

    }

    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> v = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i != n; i++) {
            for (int j = 0; j != m; j++) {
                boolean max = true;
                boolean min = true;
                for (int it : matrix[i]) {
                    if (matrix[i][j] > it) {
                        min = false;
                    }
                }
                if (min) {
                    for (int[] it : matrix) {
                        if (matrix[i][j] < it[j]) {
                            max = false;
                        }
                    }
                }
                if (max && min) {
                    v.add(matrix[i][j]);
                }
            }
        }
        return v;

    }
}
