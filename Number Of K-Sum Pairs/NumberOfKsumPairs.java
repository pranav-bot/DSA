
public class NumberOfKsumPairs {
    public static void main(String[] args) {

    }

    public static int maxOperations(int[] nums, int k) {
        int count = 0;
        int d = Integer.MIN_VALUE;
        int dCount = 0;
        for (int i = 0; i != nums.length; i++) {
            for (int j = i + 1; j != nums.length; j++) {
                int pairSum = nums[i] + nums[j];
                if (nums[i] == nums[j] && pairSum == k) {
                    if (nums[i] != d) {
                        dCount++;
                    } else {
                        d = nums[i];
                        dCount = 0;
                    }
                }
                if (pairSum == k) {
                    if (dCount <= 1) {
                        count++;
                    }

                }

            }
        }
        return count;
    }
}
