public class sumofTwoIntegers {
    public static void main(String[] args) {
        
    }
    public static int getSum(int a, int b) {
        while(b!=0){
            int ans = a^b;
            int c = (a&b)<<1;
            a = ans;
            b = c;
        }
        return a;
    }
}
    

