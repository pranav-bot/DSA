import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicatesinArr {
    public static void main(String[] args) {
        int[] a = {4,3,2,7,8,2,3,1};
        cycleSort(a);
        System.out.println(Arrays.toString(a));

        
    }
    public static List<Integer> findDuplicate(int[] nums){
        cycleSort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i!=nums.length;i++){
            if(i!=nums[i]-1){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
    public static void cycleSort(int[] arr){
        int i =0;
        while(i<arr.length){
            int correctIndex = arr[i] -1;
            if(arr[i]!=arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else{i++;}
        }
    }
    
}
