public class MissingNumber {
    public static void main(String[] args) {
        
    }
    public static int MissingNumber(int[] nums){
        int i =0;
        while(i<nums.length){
            int correctIndex = nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else{i++;}
        }
        for(int index = 0;index!=nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
        }
        return nums.length;
    }
    public static void swap(int[] arr, int first, int seccond){
        int temp = arr[first];
        arr[first] = arr[seccond];
        arr[seccond] =temp;
    }
}