public class HIndex2 {
    public static void main(String[] args) {
        int[] n = {1,3,1};
        System.out.println(hindex(n));
        
    }
    public static int hindex(int[] citations){
        if(citations.length==1){
            if(citations[0]==0){
                return 0;
            }
            return 1;
        }
        bubbleSort(citations);
        return citations[citations.length/2];
    }
    public static void swap(int[] nums, int first, int seccond){
        int temp = nums[first];
        nums[first] = nums[seccond];
        nums[seccond] = temp;
    }
    public static void bubbleSort(int[] arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped =false;
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
                    swap(arr, arr[j-1], arr[j]);
                }
                else{break;}
            }
        }
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int lastIndex = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }
    public static int getMaxIndex(int[] arr, int start, int end){
        int max = 0;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                return max;
            }
        }
        return max;
    }
}
