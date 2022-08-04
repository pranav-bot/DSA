import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(reverse(n));
        
    }
    public static int reverse(int n){
        int temp;
        int rev =0;
        while(n>0){
            temp = n%10;
            rev = rev*10+temp;
            n = n/10;
        }
        return rev;
    }
    
}
