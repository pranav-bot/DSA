
public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = { 1, 7, 3, 6, 5, 6 };
        System.out.println(pivotIndex(nums));

    }

    public static int pivotIndex(int[] nums) {
        for (int i = 0; i != nums.length; i++) {
            int lsum = 0;
            int rsum = 0;
            for (int j = 0; j != i; j++) {
                lsum = lsum + nums[j];
            }
            for (int j = i + 1; j != nums.length; j++) {
                rsum = rsum + nums[j];
            }
            if (rsum == lsum) {
                return i;
            }
        }
        return -1;
    }
}
