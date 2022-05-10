//The logic here is to check by bruteforce which two elements have the sum equal to the target and return the indexes of
//those 2 elements
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={3,3};
        int target=6;
        System.out.println(Arrays.toString(TwoSum(nums,target)));

    }
    static int[] TwoSum(int[] nums, int target){
        int[] ans=new int[2];
        for(int i=0;i!= nums.length;i++){
            for(int j=i+1;j!=nums.length;j++){
                if (target==nums[i]+nums[j]){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
}