import java.util.Arrays;

public class FrequencyofMostFrequentElement {
    public static void main(String[] args) {
        int[] a = {1,2,4};
        System.out.println(Arrays.toString(mean(a, 4)));
        System.out.println(     (Arrays.toString(maxFrequency(a, 5))));
        
    }
    public static int[] maxFrequency(int[] nums, int k){
        int[] meanArr = mean(nums, 0); 
        for(int i=0;i!=nums.length;i++){
            meanArr = mean(nums, nums[i]);
            for(int j=0;j!=meanArr.length;j++){
                if(meanArr[j]<0){
                    if(k<=0){
                        break;
                    }
                    if(meanArr[j]>k){
                        meanArr[j]=meanArr[j] - k;
                        k= k - meanArr[j];
                    }
                }
            }
    }
    return meanArr;
}
    public static int[] mean(int[] arr, int target){
        int[] ans = new int[arr.length];
        for(int i=0;i!=ans.length;i++){
            ans[i] = arr[i] - target;
        }
        return ans;
    }
    
    
}
