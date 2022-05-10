public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        
    }
    public int[] search(int[] nums, int target){
        int count = 0;
        for(int i=0;i!=nums.length;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }
        }
        int start = 0; 
        int end = nums.length-1;
        int mid = 0; 
        int[] ans = new int[2];
        while(start<=end){
            mid = start+(end-start)/2;
            if(nums[mid]<target){
                start = mid+1;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
        }
        ans[0] = mid;
        ans[1] = mid+count;  
        return ans;

    }
    
}
