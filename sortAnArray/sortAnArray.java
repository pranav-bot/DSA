package sortAnArray;

import java.util.Arrays;

public class sortAnArray {
    public static void main(String[] args) {

    }

    public static int[] sortArray(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        int mid = nums.length / 2;
        int[] left = sortArray(Arrays.copyOfRange(nums, 0, mid));
        int[] right = sortArray(Arrays.copyOfRange(nums, mid, nums.length));
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
