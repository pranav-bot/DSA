package MaxConsecutiveOnesIII;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(longestOnes(nums, k));        
    }
    public static int longestOnes(int[] nums, int k) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int zcount = 0;
            int count = 0;
            for (int j = i; j < nums.length; j++) {
                if(nums[j]==0){
                    zcount++;
                }
                if(zcount>k){
                    break;
                }
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
    public static int longestOnes2(int[] nums, int k) {
        int max = 0;
        int r = 0;
        int l = 0;
        int zcount = 0;
        int count = 0;
        while (r<nums.length) {
            if(nums[r]==0){
                zcount++;
            }
            while (zcount>k) {
                if(nums[l]==0){
                    zcount--;
                }
                l++;       
            }
            
            count = r-l+1;
            max =Math.max(max, count);
            r++;
        }
        return max;
    }
}
