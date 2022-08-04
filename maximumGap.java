import java.util.Arrays;

public class maximumGap {
    public static void main(String[] args) {
        int[] nums = {3,6,9,1};
        System.out.println(maximumGap(nums));
        
    } public static int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max =0;
        for(int i=1;i!=nums.length;i++){
            int diff = nums[i] - nums[i-1];
            if(diff>max){
                max = diff;
            }
        }
        return max;
        
    }
}