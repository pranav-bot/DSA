import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,3,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void cyclicSort(int[] arr){
        int i =0;
        while(i<arr.length){
            int correct = arr[i] -1;
            if(arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else{i++;}
        }
    }
}