public class FindMiInRotatedSortedArr2 {
    public static void main(String[] args) {
        int[] a ={0,0,1,1,2,0};
        System.out.println(findPivot(a));
        System.out.println(findMin(a));
        
    }
    public static int findMin(int[] nums){
        int pivot = findPivot(nums);
        if(nums.length==1){
            return nums[0];
        }
        if(pivot==-1){
            return nums[0];
        }
        else{
            return nums[pivot+1];
        }
    }
    public static int findPivot(int[] arr){
        if(arr.length==1){
            return -1;
        }
        int start = 0; 
        int end = arr.length-1;
        while(start<=end){
            while(start<end && arr[start]==arr[start+1]){
                start++;
            }
            while(start<end && arr[end]==arr[end-1]){
                end--;
            }
            while(start<end && arr[start]==arr[end]){
                end--;
            }
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
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

}
