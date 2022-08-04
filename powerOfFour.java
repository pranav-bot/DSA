public class powerOfFour {
    public static void main(String[] args) {
        int n =15;
        System.out.println(isPowerOfFour(n));
        
    }
    public static boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        int oneCounter = 0;
        int digitCount=0;
        while(n>0){
            int a=n&1;
            if(a==1){
                oneCounter++;
            }
            if(oneCounter>1){
                return false;
            }
            digitCount++;
            n= n>>1;
        }
        if(digitCount>2 && digitCount%2==1){
            return true;
        }
        return false;
    }
}
    

