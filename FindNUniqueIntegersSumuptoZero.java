//The logic here-
// if n is even create an array with the first half being positive integers and second half being the negative counterpart of the
//first half
//if n is odd create an array with the first half being positive integers and second half being the negative counterpart of the
////first half and the middle element being 0
import java.util.Arrays;

public class FindNUniqueIntegersSumuptoZero {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(Arrays.toString(Nintergesr(n)));
    }

    static int[] Nintergesr(int n) {
        int[] ans = new int[n];
        int m=n/2;
        int e= ans.length-1;
        for (int i = 0; i != (n / 2); i++) {
            ans[i] =m;
            ans[e--]= -m;
            m--;

        }
            return ans;

        }
    }

