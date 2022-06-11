public class NUmberAfterADoubleReversal {
    public static void main(String[] args) {
        int num = 1800;
        System.out.println(isSameAfterReversal(num));
        
    }
    public static boolean isSameAfterReversal(int num){
        int temp = num;
        int rev = 0;
        while(temp!=0){
            int rem = temp%10;
            rev = rev*10 +rem;
            temp = temp/10;
        }
        int temp2 = rev;
        int rev2 =0;
        while(temp2!=0){
            int rem2 = temp2%10;
            rev2 = rev2*10 +rem2;
            temp2 = temp2/10;
        }
        if(rev2==num){
            return true;
        }
        return false;
    }
    
}
