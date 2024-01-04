package DailyTemperatures;

import java.util.Arrays;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
        int[] ans = dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        for (int i = 0; i != temperatures.length; i++) {
            int count = 1;
            for (int j = i + 1; j != temperatures.length; j++) {
                if (temperatures[i] < temperatures[j]) {
                    ans[i] = count;
                    break;
                } else {
                    count++;
                }
            }
        }
        return ans;
    }

}
