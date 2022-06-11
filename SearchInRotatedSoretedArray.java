public class SearchInRotatedSoretedArray {
    public static void main(String[] args) {
        int[] a = {2,5,6,0,0,1,2};
        System.out.println(findPivot(a));
        System.out.println(search(a, 3));
    }
    public static boolean search(int[] nums, int target){
        int pivot = findPivot(nums);
            if(pivot==-1){
                if(binarySearch(nums, target, 0, nums.length-1) == true){
                    return true;
                }

            }
            else if(nums[pivot]==target){
                return true;
            }
            else if(target>=nums[0]){
                if(binarySearch(nums, target, 0, nums.length-1) == true){
                    return true;
                }
            }
            return false;
            }
    public static int findPivot(int[] arr){
        int start = 0; 
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>=arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<= arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<= arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static boolean binarySearch(int[] arr,int target,  int start, int end){
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if (target>arr[mid]){
                start= mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }



}