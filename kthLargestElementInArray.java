import java.util.Arrays;

public class kthLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public int findKthLargest(int[] nums, int k) {
        bubbleSort(nums);
        return nums[nums.length-k];

        
    }
    public static void bubbleSort(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){ 
                    swap(arr, j, j-1);
                    swapped =true;
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
                else{break;}
            }
        }
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i!=arr.length;i++){
            int lastIndex = arr.length-i-1;
            int max = getMax(arr, lastIndex);
            swap(arr, max, lastIndex);
        }
    }
    public static int getMax(int[] arr, int end){
        int max = arr[0];
        for(int i=1;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int[] arr, int first,int seccond){
        int temp = arr[first];
        arr[first]  = arr[seccond];
        arr[seccond] = temp;
    } 
}