package LargestNumber;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = { 3, 30, 34, 5, 9 };
        System.out.println(largestNumber(nums));

    }

    public static String largestNumber(int[] nums) {

        String ans = "";
        nums = mergeSort(nums);
        if (nums.length == 2) {
            if (nums[0] > reduce(nums[1])) {
                ans = ans + Integer.toString(nums[0]);
                ans = ans + Integer.toString(nums[1]);
            } else {
                ans = ans + Integer.toString(nums[1]);
                ans = ans + Integer.toString(nums[0]);
            }
            return ans;
        }

        int sidx = 0;
        int didx = nums.length - 1;
        for (int i = 0; i != nums.length; i++) {
            if (nums[i] > 10) {
                sidx = i - 1;
                break;
            }
        }
        int i = sidx;
        int j = didx;
        while (i != 0 || j > sidx) {
            if (nums[i] > reduce(nums[j])) {
                ans = ans + Integer.toString(nums[i]);
                i--;
            } else {
                ans = ans + Integer.toString(nums[j]);
                j--;
            }
        }

        return ans;
    }

    public static int reduce(int b) {
        while (b > 10) {
            b = b / 10;

        }
        return b;
    }

    public static int[] mergeSort(int[] arr) {
        // Base Condition
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);

    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                newArr[k] = arr1[i];
                i++;
            } else {
                newArr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            newArr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            newArr[k] = arr2[j];
            j++;
            k++;
        }
        return newArr;
    }

}