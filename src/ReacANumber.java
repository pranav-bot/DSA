public class ReacANumber {
    public static void main(String[] args) {
        System.out.println(reachNumber(2));
        
    }
    public static int reachNumber(int target){
        int sum=0;
       for(int i=0; sum!=target;i++){
           if(sum<target){
               sum =sum +i;
           }
           else if(sum>target){
               sum = sum-i;
           }
           else{
               return i;
           }
       } 
       return -1;
    }
    
}
