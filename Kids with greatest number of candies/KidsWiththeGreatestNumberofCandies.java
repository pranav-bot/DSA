//The logic here is to find the max value of the first array
//then create a new array with the elements of previous array + the extra candies
//then compare the values of the second array with the max value of first array
import java.util.ArrayList;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
        int[] a={2,3,5,1,3};
        int b=3;
        System.out.println(kidwithgreatestcandies(a,b));
    }
    static ArrayList<Boolean> kidwithgreatestcandies(int[] candies, int extraCandies){
        ArrayList<Boolean> ans=new ArrayList<>(candies.length);
        int[] nums1=new int[candies.length];
        for(int i=0;i!=candies.length;i++){
            nums1[i] = candies[i] + extraCandies;
        }
        int max=candies[0];
        for(int i=1;i!=candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
        for(int i=0;i!= nums1.length;i++){
            if(nums1[i]>=max){
                ans.add(true);
            }
            else if(nums1[i]<max){
                ans.add(false);
            }
        }
        return ans;

    }
}
