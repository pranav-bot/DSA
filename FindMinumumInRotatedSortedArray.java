public class FindMinumumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] a = {1,2,2,2,0};
        System.out.println(findPivot(a));
        System.out.println(searchMin(a));
        
    }
    public static int searchMin(int[] nums){
        if(nums.length==2){
            if(nums[0]>=nums[1]){
                return nums[1]; 
          }
          else{
              return nums[0];
          }
        }
        if(findPivot(nums)==0){
            return nums[1];

        }
        if(findPivot(nums)==-1){
            return nums[0];
        }
        else if(nums[findPivot(nums)+1]>=nums[findPivot(nums)] && nums[findPivot(nums)]<=nums[findPivot(nums)-1]){
            return nums[findPivot(nums)];
        }
        else if(nums[findPivot(nums)+1]<nums[findPivot(nums)]){
            return nums[findPivot(nums)+1];
        }
        else  {
            return nums[findPivot(nums)-1];
        }
    }
    public static int findPivot(int[] arr){
        int start = 0; 
        int end = arr.length-1;
        while(start<=end){
            while(start<end && arr[start]==arr[start+1]){
                start++;
            }
            while(start<end && arr[end]==arr[end-1]){
                end--;
            }
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
    public int binarySearch(int[] arr,int target,  int start, int end){
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if (target>arr[mid]){
                start= mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    
}
