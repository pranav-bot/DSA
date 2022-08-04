import java.util.Arrays;

import javax.xml.namespace.QName;

public class MaxProductOftwoElsements {
    public static void main(String[] args) {
        int[] a = {1,5,4,5};
        bubble(a);
        System.out.println(Arrays.toString(a));
        
    }
    public static int MaxProduct(int[] nums){
        bubble(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
    public static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i=0;i<arr.length;i++){
            swapped =false;
            //for each step, the max item will come at the last respective index
            for(int j=1;j<arr.length-i;j++){
                //swap if the item is smaller than the previous item
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