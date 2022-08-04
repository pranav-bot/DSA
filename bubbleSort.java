import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i=0;i<arr.length;i++){
            swapped =false;
            //for each step, the max item will come at the last respective index
            for(int j=1;j<arr.length-i;j++){
                //swap if the item is smaller tyhan the previous item
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped =true;
                }
            }
            if(!swapped){
                break;
            }
        }

        }
    }
