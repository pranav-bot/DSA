public class setMismatch {
    public static void main(String[] args) {
        
    }
    public static int[] findErrorNums(int[] nums){
        cycleSort(nums);
        int[] ans = new int[2];
        for(int i = 0; i!=nums.length;i++){
            if(i!=nums[i]-1){
                ans[0] = nums[i];
                ans[1] = i+1;
                break;
            }
        }
        return ans;
    }
    public static void cycleSort(int[] arr){
        int i =0;
        while(i<arr.length){
            int correctIndex = arr[i] -1;
            if(arr[i]!=arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else{i++;}
        }
    }
    
}
