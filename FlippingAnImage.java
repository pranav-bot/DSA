import java.util.Arrays;

import javax.swing.text.AbstractDocument.LeafElement;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] a = {{1,1,0},{1,0,1}, {0,0,0}};
        int [] [] b = flipAndInvertImage(a);
        for(int i=0; i!=b.length;i++){
            System.out.println(Arrays.toString(b[i]));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image){
        int l = image.length;
        for(int i=0; i!=l;i++){
            int start = 0;
            int end = l-1;
            while(start<=end){
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<l;i++){
            for(int j=0;j<l ;j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }
                else if(image[i][j]==1){
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}