//the logic here is to create a new array of double the size than the first array
import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args) {
        int[] n={1,2,1};
        System.out.println(Arrays.toString(concatenationofarray(n)));
    }
    static int[] concatenationofarray(int[] nums){
        int[] ans=new int[nums.length*2];
        int endIndex= nums.length;
            for(int i=0;i!= ans.length/2;i++){
                ans[i]=nums[i];
            }

        for(int i=0;i!= nums.length;i++) {
                ans[endIndex]=nums[i];
                endIndex++;
            }

        return ans;
    }
}
