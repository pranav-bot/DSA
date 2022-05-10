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
        for(int i=0; i!=image.length;i++){
            for(int j=0; j!=image[i].length;j++){
                if(i%2!=0){
                    int start = 0; 
                    int end = image[i].length;
                    int middle = start + (end-start)/2;
                    for(int k=0;k!=image[i].length;k++){
                        int temp  =image[i][k];
                        image[i][k] = image[i][image[i].length-k];
                        image[i][image[i].length-k] = temp; 
                }
                }
            }
        }
        return image;
    }
}