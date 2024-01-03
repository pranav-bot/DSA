package countOfSmallerNumbesAfterSelf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countofSmallerNumbersAfterSelf {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 6, 1 };
        System.out.println(countSmaller(arr));

    }

    public static List<Integer> countSmaller(int[] arr) {
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i != arr.length; i++) {
            int count = 0;
            for (int j = i; j != arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
            ans.add(count);
        }
        return ans;
    }

}