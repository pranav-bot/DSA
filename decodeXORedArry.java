import java.util.Arrays;

public class decodeXORedArry {
    public static void main(String[] args) {
        int[] encoded = {6,2,7,3};
        System.out.println(Arrays.toString(decode(encoded, 4)));
        
        
    }
    public static int[] decode(int[] encoded, int first){
        int[] ans = new int[encoded.length+1];
        ans[0] = first; 
        for(int i=1;i!=ans.length;i++){
            ans[i] = encoded[i-1]^ans[i-1];   
        }
        return ans;
    }
    
}
