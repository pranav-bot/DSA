import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] a  = {1,2,3,4,5,6,7};
        int[] b = rotate(a, 3);
        System.out.println(Arrays.toString(b));
        
    }
    public static int[] rotate(int[] nums, int k){
        int start =0; 
        int end = nums.length-1;
        for(int i=0; i!=k+1;i++){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
        return nums;
    }
}
