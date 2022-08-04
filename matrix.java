import java.util.Arrays;

public class matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int k=0;
        for(int i =0;i!= matrix.length;i++){
            for(int j =0; j!=matrix[i].length;j++){
                matrix[i][j] = 2*i+j;
                k++;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            // inner loop for column
            for (int j = 0; j < matrix[i].length; j++) {
              System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // new line
          }
        
    }
    
}
