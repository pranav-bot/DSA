package MaximumWidthRamp;

import java.util.Stack;

public class MaximumWidthRamp {
    public static void main(String[] args) {
        int[] nums = {6,0,8,2,1,5};
        System.out.println(maxWidthRamp(nums));
    }
    public static int maxWidthRamp(int[] nums) {
        int ans = 0;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if(s.isEmpty() || nums[s.peek()]>nums[i]){
                s.push(i);
                System.out.println(nums[s.peek()]);
            }
        }
        for (int i = nums.length - 1; i > ans; --i) {
            while (!s.isEmpty() && nums[s.peek()] <= nums[i]) {
                ans = Math.max(ans, i - s.peek());
                s.pop();  
            }
        }

        return ans;
    }
}
