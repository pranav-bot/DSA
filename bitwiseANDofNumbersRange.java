public class bitwiseANDofNumbersRange {
    public static void main(String[] args) {
        int left = 2;
        int right = 7;
        System.out.println(rangeBitwiseAnd(left, right));
        
    }
    public static int rangeBitwiseAnd(int left, int right) {
        if((left==0 && right==0 )|| left==1 && right==2147483647){
            return 0;
        }
        if(left ==right){
            return 1;
        }
        int sum=left;
        for(int i=left+1;i!=right;i++){
            sum = sum&i;

        }
        return sum;     
        
    }
}
    

