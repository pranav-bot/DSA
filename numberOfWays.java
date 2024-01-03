public class numberOfWays {
    public static void main(String[] args) {

    }

    public int largestOdd(int[] nums) {
        int max = 0;
        int n = nums.length;
        for (int i = 0; i != n; i++) {
            if (nums[i] % 2 != 0)

            {
                if (max < nums[i]) {
                    max = i;
                }
            }
        }

        return max;
    }

    int largestEven(int[] nums) {
        int max = 0;
        int n = nums.length;
        for (int i = 0; i != n; i++) {
            if (max < nums[i])

            {
                if (nums[i] % 2 == 0) {
                    max = i;
                }
            }
        }

        return max;
    }

    public long maxScore(int[] nums, int x) {

        int eMax = largestEven(nums);
        int oMax = largestOdd(nums);
        long eSum = 0;
        long oSum = 0;
        long eAns = 0;
        long oAns = 0;
        for (int i = 0; i != nums.length; i++) {
            if (nums[i] % 2 == 0) {
                eSum = eSum + nums[i];
            }
        }

        for (int i = 0; i != nums.length; i++) {
            if (nums[i] % 2 != 0) {
                oSum = oSum + nums[i];
            }
        }

        if (nums[eMax] > x) {
            int temp = 0;
            for (int i = 0; i != eMax; i++) {
                if (nums[i] % 2 != 0) {
                    temp = temp + nums[i];
                }
            }
            if ((temp + nums[eMax] - 5) > oSum) {
                oAns = temp + nums[eMax] - 5;
            } else {
                oAns = oSum;
            }
        }
        if (nums[oMax] > x) {
            int temp = 0;
            for (int i = 0; i != oMax; i++) {
                if (nums[i] % 2 != 0) {
                    temp = temp + nums[i];
                }
            }
            if ((temp + nums[oMax] - 5) > eSum) {
                eAns = temp + nums[oMax] - 5;
            } else {
                eAns = eSum;
            }
        }
        if (eAns > oAns) {
            return eAns;
        } else {
            return oAns;
        }
    }
}