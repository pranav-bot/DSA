public class countPrimes {
    public static void main(String[] args) {
        int n = 499979;
        System.out.println(countPrimes(n));
        
    }
    public static int countPrimes(int n){
        int count = 0;
        for(int i=0;i!=n;i++){
            if(isPrime(i)==true){
                count++;
            }
        }
        return count;
    }
    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
    public static int countPrimes2(int n){
        boolean[] arr = new boolean[n+1];
        int count = 0;
        for (int i = 2; i*i <= n; i++) {
            if(!arr[i]) {
                for (int j = i *2; j <= n; j += i) {
                    arr[j] = true;
                }
            }
        }
        
        for (int i = 2; i < n; i++) {
            if (!arr[i]) {
                count++;
            }
        }
        
        return count;
    }
    
}
