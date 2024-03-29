import java.util.Arrays;

public class findDuplicate {
    public static void main(String[] args) {
        int[] a = {1,3,4,2,2};
        System.out.println(findDuplicates(a));

    }
    public static int findDuplicates(int[] nums){
        cycleSort(nums);
        return nums[nums.length-1];

    }
    public static void cycleSort(int[] arr){
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