import java.util.Arrays;

public class MAxProductOfthreeNums {
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3};
        System.out.println(maxproduct(nums));        
    }
    public static int maxproduct(int[] nums){
        bubbleSort(nums);
        int ans1 = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int ans2 = nums[0]*nums[1]*nums[nums.length-1];
        if(ans1>ans2){
            return ans1;
        }
        else{
            return ans2;
        }
    }
    public static void bubbleSort(int[] nums){
        boolean swapped;
        for(int i=0;i<nums.length;i++){
            swapped =false;
            for(int j=1;j<nums.length-i;j++){
                if(nums[j-1]>nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    
}
