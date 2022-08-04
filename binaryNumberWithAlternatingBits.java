public class binaryNumberWithAlternatingBits {
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(7));
        
    }
    public static boolean hasAlternatingBits(int n) {
        while(n>0){
            int k = n&1;
            n = n>>1;
            int q = n&1;
            if(k==q){
                return false;
            }
        }
        return true;
    }
}
    

