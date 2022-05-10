import java.util.Scanner;

public class ArrangingCoins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
}
public int arrangecoins(int n){
    int start = 1;
    int end = n; 
    int mid =0;
    int result=0;
    while(start<=end){
         mid = start + (end-start)/2;
        int coins = (mid*(mid+1))/2;
        if(coins>n){
            end = mid-1;
        }
        else if(coins<n){
            start = mid+1;
            result = Math.max(result, mid);
        }
    }
    return (int)result;
}
}