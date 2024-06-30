package SubArrayProductLessThanK;

public class SubArrayProductLessThanK {
    public static void main(String[] args) {
        int[] nums = {10,5,2,6};
        int k = 100;
        System.out.println(numSubarrayProductLessThanK2(nums, k));
        
    } 
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int prod = 1;
            for (int j = i; j < nums.length; j++) {
                prod *= nums[j];
                if(prod<k){
                    count++;
                }
                else if(prod>k) {
                    break;
                }
            }
        }
        return count;   
    }
    public static int numSubarrayProductLessThanK2(int[] nums, int k) {
        int count =0 , l = 0, r = 0;
        int prod = 1;
        while (r<nums.length) {
            prod *= nums[r];
            while(prod>k){
                prod /= nums[l];
                l++;
            }
            if(prod<k){
                count++;
            }
            r++;
        }
        if(count==0){
            return 0;
        }
        return (int) Math.pow(2, count);
    }
}
