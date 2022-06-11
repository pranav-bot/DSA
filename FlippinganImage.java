//Doesn't work yet
import java.util.Arrays;

public class FlippinganImage {
    public static void main(String[] args) {
        int[][] image;
        image = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(Arrays.toString(Flip(image)));

    }
    static int[][] Flip(int[][] image){
        int[][] ans= new int[image.length][image.length];
        for(int row=0;row!=image.length;row++){
            for(int col=0;col!=image.length;col++){
                if(ans[row][col]==0){
                    ans[row][col]=1;
                }
                else{
                    ans[row][col]=0;
                }
            }
        }
        return ans;
    }
}
