package topKfrequentElements;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class kFrequent {
    public static void main(String[] args) {

    }

    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        for (int i = 0; i != nums.length; i++) {
            int count = 0;
            for (int j = i + 1; j != nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
    }
}