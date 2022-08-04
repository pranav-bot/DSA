import java.util.ArrayList;
import java.util.List;

public class FIndAllNumbersDissapearedInArray {
    public static void main(String[] args) {
        
    }
    public static List<Integer> findDissaperaedNums(int[] nums){
        cycleSort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i!=nums.length;i++){
            if(i!=nums[i]-1){
                ans.add(i+1);
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
