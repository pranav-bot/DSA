public class CheckIfitsAGoodArray {
    public static void main(String[] args) {
        
    }
    public boolean isGoodArray(int[] nums) {
        for(int i=0;i!=nums.length;i++){
            for(int j=0;j!=nums.length;j++){
                for(int k=1;k!=100;k++){
                    for(int l=1;l!=100;l++){
                        if(nums[i]*k - nums[j]*j==1){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
}
