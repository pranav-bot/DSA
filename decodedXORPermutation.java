
import java.util.Arrays;

public class decodedXORPermutation {
    public static void main(String[] args) {
        int[] encoded = {2,6,3,4,6,4,15,1};
        System.out.println(Arrays.toString(decode(encoded)));
        
    }
    public static int[] decode(int[] encoded) {
        int[] perm = new int[encoded.length+1];
        for(int i=0;i!=perm.length;i++){
            perm[i] = i+1;
        }
        int first=0;
        int seccond =0;
        int k;
        for(int j=0;j!=perm.length;j++){
            for(k=j+1;k!=perm.length;k++){
                int a = perm[j]^perm[k];
                if(encoded[0]==a){
                    first=perm[j];
                    seccond = perm[k];
                    break;
                }
            }
            if(first==perm[j]){
                break;
            }
        }
        int[] temp = perm.clone();
        temp[0] = first;
        for(int i=1;i!=perm.length;i++){
            temp[i] = encoded[i-1]^temp[i-1];
        }
        if(linearSearch(temp, 0)){
           perm[0] = seccond;
           for(int i=1;i!=perm.length;i++){
            perm[i] = encoded[i-1]^perm[i-1];
        }
        }
        else{
            return temp;
        }
        return perm;
        
    }
    public static boolean linearSearch(int[] arr, int target){
        for(int i=0;i!=arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
    

