public class longestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {
            10,9,2,5,3,7,101,18
        };
        System.out.println(LenghtofLIS(nums));
        
    }
    public static int LenghtofLIS(int[] nums){
        int count=0;
        int count2=0;
        for(int i=0;i!=nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                count++;
            }
            else{
                
            }
        }
        return count2;
    }
    
}
