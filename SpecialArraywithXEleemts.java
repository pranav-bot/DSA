import java.util.Arrays;

public class SpecialArraywithXEleemts {
    public static void main(String[] args) {
        int[] a = {100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100};
        System.out.println(specialArray(a));
        }
    public static int specialArray(int[] nums) {
        int max = findMax(nums);
        int count=0;
        for(int i=0;i!=max+1;i++){
            count=0;
            for(int j=0; j!=nums.length;j++){
                if(i<=nums[j]){
                    count++;
                }
            }
            if(count==i){
                return i;
            }
            
        }
        return -1;
    }

    public static int findMax(int[] nums){
        int max =0;
        for(int i=0;i!=nums.length;i++){

            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }
    public static boolean linearSearch(int[] nums, int tatrget){
        for(int i=0;i!=nums.length;i++){
            if(nums[i]==tatrget){
                return true;
            }
        }
        return false;
    }
}

    

