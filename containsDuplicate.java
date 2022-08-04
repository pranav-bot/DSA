import java.util.Arrays;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] a = {3,3};
        
        System.out.println(Arrays.toString(a));
        
    }
        public static boolean containsDup(int[] nums){
            bubble(nums);
            for(int i=0;i!=nums.length-1;i++){
                if(nums[i]==nums[i+1]){
                    return true;
                }
            }
            return false;


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
    