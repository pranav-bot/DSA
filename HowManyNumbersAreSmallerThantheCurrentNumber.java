//The logic here is to count the numbers smaller than the current number by bruteforce for each element of the array
//And store the count of the number of smaller numbers in another array and return it
import java.util.Arrays;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
    public static void main(String[] args) {
        int[] nums={6,5,4,8};
        System.out.println(Arrays.toString(smallernumbers(nums)));
        System.out.println(nums.length);
    }
    static int[] smallernumbers(int[] nums){
        int[] ans=new int[nums.length];
        for(int i=0;i!= nums.length;i++){
            int count=0;
            for(int j=0;j!=nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }

            }
            ans[i]=count;
        }
        return ans;
    }
}
