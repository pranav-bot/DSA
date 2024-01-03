package sortAnArray;

public class sortAnArrayinPlace {
    public static void main(String[] args) {

    }

    public int[] sortArray(int[] nums) {
        inPlaceMergeSort(nums, 0, nums.length);
        return nums;
    }

    public static void inPlaceMergeSort(int[] arr, int s, int e) {
        // base condition
        if (e - s == 1) {
            return;
        }
        int mid = (s + e) / 2;
        inPlaceMergeSort(arr, s, mid);
        inPlaceMergeSort(arr, mid, e);
        mergeInPlace(arr, s, mid, e);
    }

    public static void mergeInPlace(int[] arr, int s, int mid, int e) {
        int newArr[] = new int[e - s];
        int i = s;
        int j = mid;
        int k = 0;
        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                newArr[k] = arr[i];
                i++;
                k++;
            } else {
                newArr[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i < mid) {
            newArr[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            newArr[k] = arr[j];
            j++;
            k++;
        }
        System.arraycopy(newArr, 0, arr, s + 0, newArr.length);
    }
}
