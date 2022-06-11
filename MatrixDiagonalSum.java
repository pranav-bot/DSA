//The logic here is to find the sum of diagonal using the formula sum=sum+mat[i][i] for the left to right diagonal
// and the formula sum =sum+mat[i][length of matrix -i-1] for the right to left diagonal
//With 2 exceptions:
//1)If the matrix is of size 1 then it will return mat[0][0].
//2)If the length of matrix is odd it will count the middle element only once.
public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        System.out.println(diagonalsum(mat));
        System.out.println(mat.length);
    }
    static int diagonalsum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        int mid = n/2;
        if(n == 1){
            return mat[0][0];
        }

        for(int i = 0; i < n; i++){
            sum += mat[i][i];
            if(n % 2 == 1){
                if(i != mid){
                    sum += mat[i][n-i-1];
                }
            }
            else {
                sum += mat[i][n - i - 1];
            }
        }
        return sum;
    }
}