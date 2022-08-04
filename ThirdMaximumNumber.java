import java.util.Arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        System.out.println(thirdmaxnum(nums));   
    }
    public static int thirdmaxnum(int[] nums){
        if(nums.length < 2)
            return nums[0];
        int first = 0, second = -1, third = -1; // where first is first distinct maximum, second is second distinct maximum and third is third distinct maximum
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[first]) {
                third = second;
                second = first;
                first = i;
            } 
            else if(nums[i] < nums[first]) {
                if(second == -1 || nums[i] > nums[second]) {
                    third = second;
                    second = i;
                } 
                else if(nums[second] > nums[i]) {
                    if(third == -1 || nums[i] > nums[third])
                        third = i;
                } 
            }
        }
        return third != -1 ? nums[third] : nums[first];
    }
}