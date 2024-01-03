public class FindXORSumofAllPairsBitwiseAND {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };
        System.out.println(getXORSum(arr1, arr2));

    }

    public static int getXORSum(int[] arr1, int[] arr2) {
        int a = 0;
        int b = 0;
        for (int num : arr1) {
            a ^= num;
        }
        for (int num : arr2) {
            b ^= num;
        }
        return a & b;
    }
}