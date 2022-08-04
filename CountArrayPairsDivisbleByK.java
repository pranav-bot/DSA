public class CountArrayPairsDivisbleByK {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int k = 2;
        System.out.println(countPairs(nums, k));
        
    }
    public static long countPairs(int[] nums, int k){
        long count =0;
        for(int i=0;i!=nums.length;i++){
            for(int j=i+1;j!=nums.length;j++){
                if(nums[i]*nums[j]%k==0){
                    count++;
                }
            }
        }
        return count;
    }
    
}
