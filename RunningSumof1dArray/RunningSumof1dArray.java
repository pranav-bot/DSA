
//The logic here is to find the sum of all the previous elements
import java.util.Arrays;
import java.util.Scanner;

public class RunningSumof1dArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i != n; i++) {
            arr[i] = in.nextInt();
        }
        runningsum(arr);
        System.out.println(Arrays.toString(arr));
        in.close();

    }

    static int[] runningsum(int[] nums) {
        for (int i = 1; i != nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
