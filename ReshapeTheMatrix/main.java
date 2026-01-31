package ReshapeTheMatrix;

public class main {
    public static void main(String[] args) {
        int mat[][] = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        int[][] ans = matrixReshape(mat, r, c);
        for(int[] i: ans){
            for (int j: i){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int ans[][] = new int[r][c];
        int p = 0;
        int q = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                ans[p][q] = mat[i][j];
                q++;
                if(q==c){
                    q = 0;
                    p++;
                }
            }
        }
        return ans;
    }
}
