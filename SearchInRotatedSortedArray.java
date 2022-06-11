public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] a ={3,1};
        System.out.println(search(a, 1));
    }
    public static boolean search(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            while(start<end && nums[start]==nums[start+1]){
                start++;
            }
            while(start<end && nums[end]==nums[end-1]){
                end--;
            }
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[mid]>target){
                if(nums[start]>nums[mid] || nums[start]<=target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(nums[start]<=nums[mid] || nums[start]>target){
                    start = mid+1;
                }
                else{
                    end= mid-1;
                }
            }

        }
        return false;

        }
    }
