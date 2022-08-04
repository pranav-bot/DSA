import java.time.Year;

public class hammingDistance {
public static void main(String[] args) {
    int x = 3;
    int y = 1;
    System.out.println(hammingDistance(x,y));
}
public static int totalHammingDistance(int[] nums){
    int sum=0;
    for(int i=0;i!=nums.length;i++){
        for(int j =i+1;j!=nums.length;j++){
            sum = sum +hammingDistance(nums[i],nums[j]);
        }
    }
    return sum;
} 
public static int hammingDistance(int x, int y) {
    int xor = x^y;
    int count =0;
    while(xor>0){
        int a = xor&1;
        if(a==1){
            count++;
        }
        xor = xor>>1;
    }
    return count;
        
}
}