import java.util.Arrays;

public class singleNumber3 {
    public static void main(String[] args) {
        int[] a = {0,0,1,2};
        System.out.println(Arrays.toString(singleNumber(a)));

        
    }
    public static int[] singleNumber(int[] nums) {
        if(nums.length==2){
            return nums;
        }
        int[] ans = new int[2];
        int xorSum = 0;
        int temp = 0;
        for(int num:nums){
            xorSum ^= num;
        }
       for(int i=0;i!=ans.length;i++){
        if(i==1){
            temp = linearSearch(nums, xorSum^ans[0]);
        }
        else{
            temp = nums.length;
        }
        for(int j=0;j!=temp;j++){
            int a = xorSum^nums[j];
            if(linearSearch(nums, a)!=-1){
                ans[i] = a;
            }
        }
       }
        return ans;

    }
    public static int linearSearch(int[] arr, int target){
        for(int i=0;i!=arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
