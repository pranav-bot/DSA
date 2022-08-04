import java.util.Arrays;

public class FirstMissimgPositive {
    public static void main(String[] args) {
        int[] a = {3,4,-1,1};
        System.out.println(firstMisingPositive(a));
    }
    public static int firstMisingPositive(int[] nums){
        cycleSort(nums);
        for(int i=0;i!=nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;

    } 
    public static void cycleSort(int[] nums){
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]>0&&nums[i]<nums.length&&nums[i]!=nums[correct]){
                int temp =nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{i++;}
        }
    }
}