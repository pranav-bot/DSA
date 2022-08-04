public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2,1,1,2};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums){
        int oddsum=0;
        int evensum=0;
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0], nums[1]);
        }
        int extremeSum = nums[0] + nums[nums.length-1];
       for(int i=0;i<nums.length;i=i+2){
        evensum = nums[i]+evensum;
       }
       for(int i=1;i<nums.length;i=i+2){
        oddsum = nums[i]+oddsum;
       }

      return Math.max((Math.max(evensum, oddsum)),extremeSum);
    }
    
}
