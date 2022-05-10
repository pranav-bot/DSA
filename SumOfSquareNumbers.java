public class SumOfSquareNumbers {
    public static void main(String[] args) {
       
    }
    public boolean judgeSquareSum(int c){
       int s = 0;
       int e = c;
       while(s<=e){
           int ans = (s*s) +(e+e);
           if(ans == c){
               return true;
            } 
            else if(ans>c){
                e--;
            }
            else{
                s++;
            }              
        }
        return false;

    }
    
}
