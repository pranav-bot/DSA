public class FindInMountainArray {
    public static void main(String[] args) {
        
    }
    public int findMountaionArray(int target, MountainArray mountainArr){
        return binarySearch(mountainArr, target, 0, findPeakElement(mountainArr));

    }
    public int findPeakElement(int[] arr){
        if (arr.length==1){
            return 0;
        }
        if(arr[0]> arr[1]){
            return 0;
        }
        else if(arr[arr.length-1]>arr[arr.length-2]){
            return arr.length-1;
        }
        if(arr.length==2){
            int a = arr[0];
            int b = arr[1];
            if(a>b){
                return 0;
            }
            else{
                return 1;
            }
        }
        for(int i=1;i!=arr.length;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                return i;
            }
        }
        return 0;
    }
    public int binarySearch(int[] arr,  int target, int start,  int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    
}
