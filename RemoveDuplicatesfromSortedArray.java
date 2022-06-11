//The logic works but not the code
//the logic here is to sort the array in ascending order
//Then take the count=length of the array
//then for every duplicate number count=count-1
import java.awt.color.ICC_ColorSpace;
import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,5,3,3,2};
        System.out.println(Arrays.toString(removeduplifromsortedarr(nums)));
    }

    static int[] removeduplifromsortedarr(int[] nums) {
        for(int i=0;i!= nums.length;i++){
            for(int j=i+1;j!=nums.length;j++){
                int temp=nums[i];
                if(nums[i]==nums[j]){
                    nums[j]=1000000000;
                }
                if(nums[i]>nums[j]){
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.println(nums);
        int count= nums.length;
        for(int i=0;i!=nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count--;
            }
        }
        return nums;

    }
}