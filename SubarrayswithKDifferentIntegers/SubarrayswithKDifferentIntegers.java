package SubarrayswithKDifferentIntegers;

import java.util.HashMap;
import java.util.Map;

public class SubarrayswithKDifferentIntegers {
    public static void main(String[] args) {
        
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int count =  0;
        for (int i = 0; i < nums.length; i++) {
            HashMap<Integer, Integer> hash = new HashMap<>();
            for (int j = i; j < nums.length; j++) {
                if(!hash.containsKey(nums[j])){
                    hash.put(nums[j], 1);
                }
                hash.put(nums[j], hash.get(nums[j])+1);
                if(hash.size()==k){
                    count++;
                }
                else if(hash.size()>k){
                    break;
                }
            }
        }
        return count;
    }
    public int subarraysWithKDistinct2(int[] nums, int k){
        if(k<0){
            return 0;
        }
        int count = 0;
        int l =  0;
        int r =  0;
        Map<Integer, Integer> hash = new HashMap<>();
        while (r<nums.length) {
            hash.put(nums[r], hash.getOrDefault(nums[r], 0) + 1);
            while(hash.size()>k){
                hash.put(nums[l], hash.get(nums[l])-1);
                if(hash.get(nums[l])==0){
                    hash.remove(nums[l]);
                }
                l++;
            }
            count += (r-l+1);
            r++;
        }
        return count;
    }
}
