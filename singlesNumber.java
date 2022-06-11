public class singlesNumber {
    public static void main(String[] args) {
        int[] nums = {-1,-1,-2};
        System.out.println(singleNumber(nums));
        System.out.println(linearSearch(nums, -1));
        
    }
    public static int singleNumber(int[] nums){
        for(int i=0;i!=nums.length;i++){
            if(linearSearch(nums, nums[i])==false){
                return nums[i];
            }
            }
            return 1;
        }
    public static boolean linearSearch(int[] nums, int target){
        for(int i=0;i!=nums.length;i++){
            for(int j=i+1;j!=nums.length;j++){
                if (nums[i]==nums[j] && nums[j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    
}
