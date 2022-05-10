public class SIngleElementInASortedArray {
    public static void main(String[] args) {
        int[] a  = {1,1,2,3,3};
        System.out.println(singleNonDuplicate(a));

        
    }
    public static int singleNonDuplicate(int[] nums){
        int start = 0;
        int end  = nums.length-1;
        int mid = 0;
        if(nums.length==1){
            return nums[0];
        }
        if(nums[start]!= nums[start+1]){
            return nums[start];
        }
        else if(nums[end]!= nums[end-1]){
            return nums[end];
        }
        while(start<=end){
            mid = start + (end-start)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
            if(mid%2==0){
                if(nums[mid+1]==nums[mid]){
                    start = mid +1;
                }
                else{
                    end = mid-1;
                }
            }
            else if( mid%2!=0){
                if(nums[mid+1]==nums[mid]){
                    end = mid -1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return nums[mid];
    }
}
