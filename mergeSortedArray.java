import java.util.Arrays;

public class mergeSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,4,2,5,74,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
        
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m;i!=m+n;i++){
            nums1[i] = nums2[j];
            j++;
        }
        selcetionSort(nums1);
    }
    public static void swap(int[] arr, int first, int seccond){
        int temp = arr[first];
        arr[first] = arr[seccond];
        arr[seccond] = temp;
    }
    public static void bubbleSort(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    swap(arr,j,j-1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void insertionSort(int[] arr){
        for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    public static void selcetionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int lastIndex = arr.length -i -1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);

        }
    }
    public static int getMaxIndex(int[] arr, int start, int end){
        int max =start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    
}


    

