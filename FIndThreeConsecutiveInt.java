import java.util.Arrays;

public class FIndThreeConsecutiveInt {
    public static void main(String[] args) {
        long num = 33;
        System.out.println(Arrays.toString(sumofThree(num)));
        
    }
    public static long[] sumofThree(long num){
        long[] ans = new long[3];
        if(num%3==0){
            ans[1] = num/3;
            ans[0] = (num/3) -1;
            ans[2] = (num/3)+1;
            return ans;
        }
        return new long[]{};
    }
    
}
