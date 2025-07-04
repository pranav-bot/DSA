package RotateImage;

public class RotateImage {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};
        rotate(matrix);
    }

    public static void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int endp = matrix[i].length - 1;
            for (int j = 0; j < matrix[i].length / 2; j++) { // Swap only until half
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][endp];
                matrix[i][endp] = temp;
                endp--;
            }
        }
    }
}
