package NextGreaterelement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
        
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i!=nums2.length;i++){
            for(int j=i+1;j!=nums2.length;j++){
                if(nums2[i]<nums2[j]){
                    m.put(nums2[i], nums2[j]);
                    break;
                }
            }
        }
        int i=0;
        for(int num:nums1){
            ans[i] = m.getOrDefault(num, -1);
            i++;
        }
        return ans;
    }
}






