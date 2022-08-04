public class powXN {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        System.out.println(mypow(x, n));
    }
    public static double mypow(double x, int n){
        double ans = 1;
        while(n>0){
            if((n&1)==1){
                ans = ans*x;
            }
            x = x*x;
            n = n>>1;
        }
        return ans;
    }
}