//The Logic here is to interchange the values if i and j in a matrix with aij elements.
import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] n={
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        int ans[][] =transpose(n);
        for(int i=0;i!=n.length;i++){
            for(int j=0;j!=n.length;j++){
                System.out.println(ans[i][j]+"");
            }
            System.out.println();
        }
    }
    static int[][] transpose(int[][] matrix){
        int[][] ans=new int[matrix[0].length][matrix.length];
        for(int i=0;i!= matrix.length;i++){
            for(int j=0;j!=matrix[i].length;j++){
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;
    }
}
