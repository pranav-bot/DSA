class divideTwoIntegers{
    public static void main(String[] args) {
        System.out.println(divide(10, 3));
        
    }
    public static int  divide(int dividend, int divisor){
        int counter =0;
        while(dividend>divisor){
            dividend = dividend-divisor;
            counter++;
        }
        return counter;
    }
}