public class findDuplicate {
    public static void main(String[] args) {

    }
    public static int findDuplicates(int[] nums){
        Arrays.sort(nums);
        
        for(int i=0;i!=nums.length;i++){
            for(int j=i+1;j!=nums.length;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;
    }
    
}
