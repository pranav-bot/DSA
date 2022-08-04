import java.io.FileReader;
import java.util.Arrays;

public class sortArrayByPairity {
    public static void main(String[] args) {
        int[] a = {3,1,4,2};
        System.out.println(Arrays.toString(sortArratPair(a)));
        
    }
    public static int[] sortArratPair(int[] nums){
        if(nums.length==1)
            return nums;
    int pointer=0;
    int check=1;
    while(pointer<nums.length&&check<nums.length)
    {
       if(nums[pointer]%2==0)
           pointer=pointer+2;
        else if(nums[check]%2==1)
                check=check+2;
        else{
            int temp=nums[pointer];
            nums[pointer]=nums[check];
            nums[check]=temp;
        }
    }
    return nums;
}
}  