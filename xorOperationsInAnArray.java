import java.util.Arrays;

public class xorOperationsInAnArray {
    public static void main(String[] args) {
        System.out.println(xorOperation(4, 3));
        
    }
    public static int xorOperation(int n, int start) {
        int[] a = new int[n];
        for(int i=0;i!=n;i++){
            a[i] = start+i*2;
        }
        int sum =0;
        for(int i=0;i!=n;i++){
            sum = sum^a[i];
        }
        return sum;
    }
}