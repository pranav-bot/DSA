public class primeNumberstillN {
    public static void main(String[] args) {
        sieve(40);
        
    }
    public static void sieve(int n){
        boolean[] primes = new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(!primes[i]){
                for(int j=i*2;j<=n;j=j+i){
                    primes[j] = true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!primes[i]){
                System.out.println(i);
            } 

    }
}
}