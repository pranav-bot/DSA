public class sqrtx {
    public static void main(String[] args) {
        System.out.println(sqrtx(5));
        
    }
    public static long sqrtx(int x){

        if(x == 0){
            return x;
        }
        if(x==1 || x==2){
            return 1;
        }
        long m;
        long s = 1;
        long e = x/2;
        while(s<=e){
            m = s + (e-s)/2;
            Long result = m*m;
            
            if(result>x){
                e = m-1;
            }
            else if( result<x){
                s = m+1;
            }
            else if(result == x){
                return e;
            }
        }
    return e;
}
}
