public class magicNumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(magicNumber(6));
        
    }
    public static int magicNumber(int n){
        int ans =0;
        int base = 5;
        while(n>0){
            int temp = n&1;
            ans = ans+temp*base;
            base = base *5;
            n = n>>1;
        }
        return ans;
    }
    
}
