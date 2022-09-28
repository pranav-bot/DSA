class happyNumber{
    public static void main(String[] args) {
        int n = 101;
        System.out.println(digitCounter(n));
        System.out.println(isHappy(19));
        
    }
    public static boolean isHappy(int n){
        int sum=0;
        while(n>9){
            while(n!=0){
            int rem = n%10;
            sum = sum+(rem*rem);
            n = n/10;
            }
            n=sum;
            sum=0;
    }
        
        if(n==1){
            return true;
        }
        else{
            return false;
        }
    }
    public static int digitCounter(int n){
        int count =0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
}