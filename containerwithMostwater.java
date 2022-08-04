import java.util.HexFormat;

public class containerwithMostwater {
    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        int[] b = {4,3,2,1,4};
        System.out.println(maxArea(b));
        System.out.println(maxArea(a));
        
    }
    public static int maxArea(int[] height){
        if(height.length==2){
            if(height[0]>height[1]||height[0]==height[1]){
                return height[1];
            }
            else{
                return height[0];
            }
        }
        int maxArea=0;
        for(int i=height.length-1;i!=0;i--){
            int area=0;
            for(int j=0;j!=height.length;j=j+2){
                area = (i-1) * height[j];
            }
            if(area>maxArea){
                maxArea=area;
            }
        }
        return maxArea;
    }
    
}
