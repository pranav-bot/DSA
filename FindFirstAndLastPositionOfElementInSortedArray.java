public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        
    }
    public int[] search(int[] nums, int target){
        int start = 0; 
        int end = nums.length-1;
        int mid = 0; 
        int[] ans = new int[2];
        int i1 = -1;
        int i2 = -1;
        while(start<=end){
            mid = start+(end-start)/2;
            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                i1 = mid;
                end = mid-1;
            }
        }
        start = 0; 
        end = nums.length-1;
        mid = 0; 
        while(start<=end){
            mid = start+(end-start)/2;
            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else{
                i2 = mid;
                start = mid+1;
            }
        }
        ans[0] = i1;
        ans[1] = i2;  
        return ans;

    }
    
}
