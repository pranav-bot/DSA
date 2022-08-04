import java.util.Arrays;

public class selcetionSort {
    public static void main(String[] args) {
        int[] arr = {1};
        selcetionSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void selcetionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int lastIndex = arr.length -i -1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);

        }
    }
    public static void swap(int[] arr, int first, int seccond){
        int temp = arr[first];
        arr[first] = arr[seccond];
        arr[seccond] =temp;
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
