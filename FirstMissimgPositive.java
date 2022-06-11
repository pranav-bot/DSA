import java.util.Arrays;

public class FirstMissimgPositive {
    public static void main(String[] args) {
        int[] a = {3,4,-1,1};
        boolean b = linearsearch(a, 2);
        System.out.println(b);
        int c = fitstMissingPositive(a);
        System.out.println(c);

        
    }
    public static int fitstMissingPositive(int[] nums){
        int max = -1;
        int min=-1;
        int count=0;
        for(int i=0;i!=nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        for(int i=0; i!=nums.length;i++){
            if(min>nums[i]){
                min = nums[i];
            }    
        }
        // for(int i=0;i!=max;i++){
        //     count = count+1;
        // }
        // int[] arr = new int[count+1];
        // for(int i =0;i!=arr.length;i++){
        //     arr[i]= min+i;
        // }
        for(int i =0;i!=max;i++){
            if(linearsearch(nums, i)==false && i>0){
                return i;
            }
        }
        return max+1;
    }
    public static boolean linearsearch(int[] nums, int target){
        int start = 0;
        int end =nums.length-1;
        while(start<=end){
            int mid = start + (end-start/2);
            if(mid<target){
                start = mid+1;
            }
            else if(mid>target){
                end = mid-1;
            }
            else if(mid==target){
                return true;
            }
        }
        return false;
    }
    
}