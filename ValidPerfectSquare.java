import java.sql.PseudoColumnUsage;
import java.util.Arrays;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        boolean a = isPerfectSquare(16);
        System.out.println(a);
    }
    public static boolean isPerfectSquare(int num){
        int start = 2;
        int end = num;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(mid*mid<num){    
                start = mid+1;
            }
            else if(mid*mid>num){
                end = mid-1;
            }
            else if(mid*mid==num){
                return true;
            }
        }
        return false;
}
}

