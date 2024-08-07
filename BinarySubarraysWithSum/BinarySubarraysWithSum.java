package BinarySubarraysWithSum;

public class BinarySubarraysWithSum {
   public static void main(String[] args) {
    
   }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int  sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum==goal){
                    count++;
                }
                if(sum>goal){
                    break;
                }
            }
        }
        return count;    
    }
    public int numSubarraysWithSum2(int[] nums, int goal) {
        if(goal<0){
            return  0;
        }
        int r = 0;
        int l = 0;
        int count = 0;
        int sum = 0;
        while (r<nums.length) {
            sum += nums[r];
            while(sum>goal){
                sum -= nums[l];
                l++;
            }
            count += r-l+1;
            r++;
        }
        return count;
    }
}
