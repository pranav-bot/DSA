import java.lang.annotation.Target;
import java.util.Arrays;

import javax.swing.text.TabExpander;

public class LongestConsecutivSol {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutivInt(nums));
    }
    public static int longestConsecutivInt(int[] nums){
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int res = 1;
        int prev = nums[0];
        int c = 1;
        for(int i=0;i!=nums.length;i++){
            if(nums[i]==prev+1){
                c++;
            }
            else if(nums[i]!=prev){
                c=1;
            }
            res = Math.max(res,c);
            prev = nums[i];
        }
        return res;

    }
}