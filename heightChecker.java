import java.util.Arrays;

public class heightChecker {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
    public static int heightChecker(int[] heights) {
        int[] sorted = heights.clone();
        selcetionSort(sorted);
        int count =0;
        for(int i=0;i!=heights.length;i++){
            if(heights[i]!=sorted[i]){
                count++;
            }
        }
        return count;
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
