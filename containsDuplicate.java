public class containsDuplicate {
    public static void main(String[] args) {
        
    }
        public static boolean containsDup(int[] nums){
            for(int i=0;i!=nums.length;i++){
                for(int j=0;j!=nums.length;j++){
                    if(nums[i]==nums[j]){
                        return true;
                    }
                }
            }
            return false;
        }
        
    }
