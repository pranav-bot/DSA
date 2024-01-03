package CanPlaceFlowers;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = { 0, 1, 0 };
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));

    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i != flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                count0++;
            }
            if (flowerbed[i] == 1) {
                count1++;
            }
        }
        boolean ans = true;
        int req0 = (count1 + n) - 1;
        if (req0 > count0 - n) {
            ans = false;
        }
        return ans;
    }
}
