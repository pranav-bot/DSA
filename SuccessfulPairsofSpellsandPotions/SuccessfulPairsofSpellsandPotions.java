package SuccessfulPairsofSpellsandPotions;

import java.util.Arrays;

public class SuccessfulPairsofSpellsandPotions {
    public static void main(String[] args) {
        int[] spells = { 5, 1, 3 };
        int[] potions = { 1, 2, 3, 4, 5 };
        long success = 7;
        int[] ans = successfulPairs(spells, potions, success);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans = new int[spells.length];
        Arrays.sort(potions);
        for (int i = 0; i != spells.length; i++) {
            int spell = spells[i];
            int s = 0;
            int e = potions.length - 1;
            while (s <= e) {
                int mid = s + (e - s) / 2;
                long product = (long) spell * potions[mid];
                if (product >= success) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            ans[i] = potions.length - s;
        }
        return ans;

    }

    public static int bs(int[] arr, long t) {
        int s = 0;
        int e = arr.length - 1;
        int m = (s + e) / 2;
        while (s <= e) {
            m = (s + e) / 2;
            if (arr[m] > t) {
                e = m - 1;
            } else if (arr[m] < t) {
                s = m + 1;
            }
        }
        return e;
    }

}
