import java.lang.annotation.Target;

import javax.swing.text.TabExpander;

public class LongestConsecutivSol {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutivInt(nums));
    }
    public static int longestConsecutivInt(int[] nums){