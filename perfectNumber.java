

import java.util.Arrays;

public class perfectNumber {
    public static void main(String[] args) {
        int num = 28;
        System.out.println(checkPerfectNumber(num));        
    }
    public static boolean checkPerfectNumber(int num){
        if(num==1){
            return false;
        }
        int sum =1;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                sum = sum+i+(num/i);
            }
        }
        if(sum==num){
            return true;
        }
        else{
            return false;
        }

    }
    
}
