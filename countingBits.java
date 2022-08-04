import java.util.Arrays;

public class countingBits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));
        
    }
    public static int[] countBits(int n){
        int[] ans = new int[n+1];
        for(int i=0;i!=n+1;i++){
            int count =0;
            int temp =i;
            while(temp>0){
                int a = temp&1;
                if(a==1){
                    count++;
                }
                temp = temp>>1;
            }
            ans[i] = count;
        }
        return ans;
    }
    
}
