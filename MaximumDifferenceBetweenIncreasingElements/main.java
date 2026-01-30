package MaximumDifferenceBetweenIncreasingElements;

public class main {
    public static void main(String[] args) {

    }

    public int maximumDifference(int[] nums) {
        int l = 0;
        int r = 1;
        int maxDiff = -1;
        while (r < nums.length) {
            if (nums[r] > nums[l]) {
                maxDiff = Math.max(maxDiff, nums[r] - nums[l]);
            } else {
                l = r;
            }
            r++;
        }
        return maxDiff;
    }

}
