import java.util.Arrays;

public class productOfArrayExceptself {
    public static void main(String[] args) {
        int[] a = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(a)));
       
        
    }
    public static int[] productExceptSelf(int[] nums){
        int[] ans = new int[nums.length];
        int counter=0;
        for(int i=0;i!=nums.length;i++){
            if(nums[i]==0){
                counter++;
            }
        }
        if(counter>1){
            for(int i=0;i!=nums.length;i++){
                ans[i] = 0;
            }
            return ans;
        }
        if(nums.length==2){
            if(nums[1]==0&&nums[0]==0){
                return new int[]{0,0};
            }
        }
        int product=1;
        for(int i=0;i!=nums.length;i++){
            if(nums[i]==0){
                continue;
            }
            product = product*nums[i];
        }
        int locationOfZero=-1;
        for(int j=0;j!=ans.length;j++){
            if(nums[j]==0){
                locationOfZero=j;
            }
        }
        if(locationOfZero!=-1){
            for(int i=0;i!=ans.length;i++){
                if(i!=locationOfZero){
                    ans[i]=0;
                }
                else{
                    ans[i] = product;
                }
            }
        }
        else{
            for(int i=0;i!=ans.length;i++){
                ans[i] = product/nums[i];
            }
        }

        return ans;
    }
    
}
