public class numberComplement {
    public static void main(String[] args) {
        System.out.println(findComplement(20161211));
        
    }
    public static long findComplement(long num) {
        long count =0;
        long temp =num;
        while(temp>0){
            count++;
            temp = temp>>1;
    }
    long num2=0;
        for(int i=0;i!=count;i++){
            num2 = num2*10+1;
        }
   long a = convertBinaryToDecimal(num2);
   return num^a;
}
public static long convertBinaryToDecimal(long num) {
    long decimalNumber = 0, i = 0;
    long remainder;
    
    while (num != 0) {
      remainder = num % 10;
      num /= 10;
      decimalNumber += remainder * Math.pow(2, i);
      ++i;
    }
    
    return decimalNumber;
  }
}