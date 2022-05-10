//Dosent Work
// The Logic here is to convert the elements of the array into integer
//then we add k into it after adding k we count the number of digits in it then we create a new array list to store
import java.util.ArrayList;
import java.util.Arrays;

public class AddtoArrayFormofInteger {
    public static void main(String[] args) {
        int[] n={1,2,3,4};
        int k=1;
        AddtoArrayFormOfInteger(n,k);
        System.out.println();
    }
    static ArrayList<Integer> AddtoArrayFormOfInteger(int[] num, int k){
        int nums1 = 0;
        for (int i = 0; i != num.length; i++) {
            nums1 *= 10;
            nums1 = num[i] + nums1;
        }
        System.out.println(nums1);
        int ans = nums1 + k;
        int digitcount = 0;
        int a = ans;
        while (a > 0) {
            int rem = a % 10;
            digitcount++;
            a = a / 10;
        }
        ArrayList<Integer> finalans= new ArrayList<>();
        if (ans % 10 == 0) {
            while (a > 0) {
                int rem = a % 10;
                digitcount++;
                a = a / 10;
            }
            for (int i =0; i !=digitcount; i++) {
                finalans.add(ans%10);
                ans=ans/10;
            }

        }
        else {
            int c = 0;
            while (ans > 0) {
                c = c * 10;
                c = c + ans % 10;
                ans = ans / 10;
            }
            for (int i = 0; i != digitcount; i++) {
                finalans.add(c%10);
                c = c / 10;
            }
        }
        return finalans;

    }
}