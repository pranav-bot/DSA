package KidsWithGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
    public static void main(String[] args) {

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<Boolean>();
        int max = 0;
        for (int i = 0; i != candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i != candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}
