public class HouseRobber {
    public static void main(String[] args) {
        
    }
    public static int rob(int[] nums){
        int oddsum=nums[1];
        int evensum=nums[0];
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            if(nums[0]>nums[1]){
                return nums[0];
            }
            else{
                return nums[1];
            }
        }
        for(int i=0;i!=nums.length-2;i++){
            if(i%2==0){
                evensum = evensum+nums[i+2];
            }
            else if(i%2==1){
                oddsum = oddsum+nums[i+2];
            }
        }
        if(oddsum>evensum){
            return oddsum;
        }
        return evensum;
    }
    
}
