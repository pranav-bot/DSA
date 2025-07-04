package DefuseTheBomb;

import java.util.Arrays;

public class DefuseTheBomb {
    public static void main(String[] args) {
        int[] code = {2,4,9,3};
        int k = -2;
        System.out.println(Arrays.toString(decrypt(code, k)));   
    }
    public static int[] decrypt(int[] code, int k) {
        int[] ans = new int[code.length];
        if(k>0){
            for (int i = 0; i < code.length; i++) {
                int sum = 0 ;
                for (int j = i+1; j < i+1+k; j++) {
                    int idx = j;
                    if(j>=code.length){
                        idx = j-code.length;
                    }
                    sum +=  code[idx];
            }
            ans[i] = sum;   
        } 
    }
    if(k<0){
        for (int i = 0; i < code.length; i++) {
            int sum = 0;
            for (int j = i-1; j > i+(k-1); j--) {
                int idx = j;
                if(j<0){
                    idx =  j+code.length;
                }
                sum += code[idx];
            }
            ans[i] =  sum;
        }
    }
    return ans;
}
}
