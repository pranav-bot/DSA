public class threeDivisors {
    public static void main(String[] args) {
        int n=4;
        System.out.println(isThree(n));
        
    }
    public static boolean isThree(int n){
        int count=0;
        for(int i=1;i!=n+1;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==3){
            return true;
        }
        return false;
    }
    
}
