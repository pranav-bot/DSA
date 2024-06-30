package ContainsDuplicate2;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
        
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(Math.abs(i-j)>k){
                    break;
                }
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }   
        return false;
    }
}
