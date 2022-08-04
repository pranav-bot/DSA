public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,33,45,53,333};
        System.out.println(binarySearch(arr, 33));
        System.out.println(binarySearchRecursion(arr, 33, 0, arr.length-1));
        
    }
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static int binarySearchRecursion(int[] arr, int target,int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start +(end-start)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(target>arr[mid]){
            return binarySearchRecursion(arr, target, mid+1, end);
        }
        else{
            return binarySearchRecursion(arr, target, start, mid-1);
        }
    }
}
