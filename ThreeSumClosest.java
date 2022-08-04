import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        
    }
    public static int threeSumClosest(int[] nums, int target){
        int ans = -1;
        int diff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int a = i+1;
            int b = nums.length-1;
            while(a<b){
                int z = nums[i]+nums[a]+nums[b];
                if(z-target<diff){
                    diff = z-target;
                    ans=z;
                }
                if(z>target){
                    b--;
                }
                else{
                    a++;
                }
            }
        }
        return ans;

    }
    public static void insertionSort(int[] nums){
        for(int i=0;i<nums.length-i;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j-1]>nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp; 
                }
            }
        }
    }
    
}
