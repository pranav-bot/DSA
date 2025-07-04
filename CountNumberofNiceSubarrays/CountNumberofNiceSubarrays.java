package CountNumberofNiceSubarrays;

public class CountNumberofNiceSubarrays {
    public static void main(String[] args) {
        
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int countOdd = 0;
            for (int j = i; j < nums.length; j++) {
                if(nums[j]%2==1){
                    countOdd++;
                }
                if(countOdd==k){
                    count++;
                }
                if(countOdd>k){
                    break;
                }
            }
        }    
        return count;
    }
    public int numberOfSubarrays2(int[] nums, int k) {
        if(k<0){
            return 0;
        }
        int r = 0;
        int l = 0;
        int count = 0;
        int countOdd = 0;
        while (r<nums.length) {
            countOdd += nums[r]%2;
            while(countOdd>k){
                countOdd -= nums[l]%2;
                l++;
            }
            count += r-l+1;
            r++;
        }
        return count;
    }
}
