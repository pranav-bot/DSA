public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        System.out.println(2<2);
        
    }
    public static int largestPerimeter(int[] nums){
        if(nums[0]+nums[1]>nums[2] || nums[0]+nums[2]>nums[1] || nums[1]+nums[2]>nums[0]){
            return 0;
        }
        else{
            return nums[0]+nums[1]+nums[2];
        }
    }
    
}
