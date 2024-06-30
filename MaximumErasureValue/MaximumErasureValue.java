package MaximumErasureValue;

import java.util.HashMap;

public class MaximumErasureValue {
    public static void main(String[] args) {
        int[] nums = {5,2,1,2,5,2,1,2,5};
        System.out.println(maximumUniqueSubarray(nums));
        
    }
    public static int maximumUniqueSubarray(int[] nums) {
        int l=0 , r=0;
        int sum = 0;
        int max = 0;
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i : nums) {
            hash.put(i, 0);
        }
        while (r<nums.length) {
            if(hash.get(nums[r])>0){
                while(hash.get(nums[l])!=0){
                    sum -= nums[l];
                    hash.put(nums[l], hash.get(nums[l])-1);
                    l++;
                }
                
            }
            sum += nums[r];
            hash.put(nums[r], hash.get(nums[r])+1);
            max = Math.max(sum, max);
            r++;
        }   
        return max;
    }
}
