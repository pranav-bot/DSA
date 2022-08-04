public class singleNumber2 {
    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        System.out.println(singleNumber(nums));
        
    }
    public static int singleNumber(int[] nums) {
        if(nums.length==1)return nums[0];
         int ones=0,twos=0;
        for(int num:nums){
            ones^=num&(~twos);
            twos^=num&(~ones);
        }
        return ones;
    }
}