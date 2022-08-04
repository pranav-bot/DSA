public class primeNumberofSetbitsinBinaryrepresentation {
    public static void main(String[] args) {
        
    }
    public static int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i!=right;i++){
            int temp = i;
            int count1 =0;
            while(temp>0){
                int a = temp &1;
                if(a==1){
                    count1++;
                }
                temp=temp>>1;
            }
            if(isPrime(count1)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
    }
    
