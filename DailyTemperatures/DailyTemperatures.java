package DailyTemperatures;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
        int[] ans = dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] dailyTemperatures(int[] temperatures) {
      int[] ans = new int[temperatures.length];
      Stack<Integer> s = new Stack<>();
      for(int i =  temperatures.length-1;i!=0;i--){
        while (!s.empty() && temperatures[i]>=temperatures[s.peek()]) {
            s.pop();
        }
        ans[i] = s.isEmpty()?0:s.peek()-1;
        s.push(i);
      }
      return ans;
    }

}
