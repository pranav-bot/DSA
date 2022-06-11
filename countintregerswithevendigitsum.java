public class countintregerswithevendigitsum {
    public static void main(String[] args) {
        int n =30;
        System.out.println(countEven(n));
        
    }
    public static int countEven(int num){
        int count =0;
        for(int i=2;i<=num;i++){
            int temp = i;
            int sum=0;
            while(temp!=0){
                sum = sum + temp%10;
                temp = temp/10;
            }
            if(sum<=num && sum%2==0){
                count++;
            }
        }
        return count;
    }
    
}
