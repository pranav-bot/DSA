public class plusOne {
    public static void main(String[] args) {
        System.out.println();
        
    }
    public static int[] plusone(int[] digits){
        if(digits[digits.length-1]!=9){
            digits[digits.length-1] = digits[digits.length-1]+1;
        }
        else{
            int[] ans = 
            digits[0]= digits[0] +1;
            for(int i = 1; i!=digits.length;i++){
                digits[i]=0;
            }
        }
        return digits;
    }
    
}
