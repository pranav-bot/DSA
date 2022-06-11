//The logic here is to think of the array as of two parts x1,x2,x3...xn and y1,y2,y3....yn
//then we move the even term of the x array a place ahead and then put the odd term of the y array
//to get the result x1,y1,x2,y2,x3,y3,...xn,yn
import java.util.Arrays;

public class ShuffletheArray {
    public static void main(String[] args) {
        int n=4;
        int[] nums=new int[2*n];
        nums= new int[]{1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
    static int[] shuffle(int [] nums,int n){
        int temp=0;
        int[] ans=new int[2*n];
        int j=n;
        for(int i=0;i!=2*n;i++){
            if(i%2==0){
                ans[i]=nums[temp];
                temp++;
            }
            else{
                ans[i]=nums[j];
                j++;
            }
        }
        return ans;
    }
}
