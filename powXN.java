public class powXN {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println(mypow(x, n));
    }
    public static double mypow(double x, int n){
        double ans=0;
       if(n==0){
           return 1;
       }
       else if(n%2==0){
           ans = mypow(x, n/2)*mypow(x, n/2);
       }
       else{
           ans =x*mypow(x, n/2)*mypow(x, n/2);
       }
       return ans;
    }
    
}
