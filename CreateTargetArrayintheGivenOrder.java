//The logic here is to make a new Arraylist and store elements of the 1st array at the index according to
// the elements of the 2nd array
import java.util.ArrayList;

public class CreateTargetArrayintheGivenOrder {
    public static void main(String[] args) {
        int[] nums ={0,1,2,3,4};
        int[] index ={0,1,2,2,1};
        System.out.println(targetarray(nums ,index));

    }
    static int[] targetarray(int[] nums, int[] index){
        ArrayList nums2=new ArrayList();
        int[] ans =new int[index.length];
        for(int i=0;i!= index.length;i++){
            nums2.add(index[i],nums[i]);
        }
        for(int i=0;i!= index.length;i++){
            ans[i]= (int) nums2.get(i);
        }
        return ans;
    }
}
