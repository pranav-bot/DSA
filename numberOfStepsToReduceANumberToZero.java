public class numberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        
    }
    public int numberOfSteps(int num) {
        return totalSteps(num, 0);
        
    }
    public static int totalSteps(int num, int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return totalSteps(num/2, steps+1);
        }
        else{
            return totalSteps(num-1, steps+1);
        }
        
    }
}
    
