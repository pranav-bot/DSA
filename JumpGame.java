//Doesn't work
public class JumpGame {
    public static void main(String[] args) {
        int[] a={2,3,1,1,4};
        System.out.println(JumpGame(a));


    }
    static int JumpGame(int[] nums){
        if(nums.length==1){
            return 0;
        }
        int i=nums[0]+1;
        int step =i;
        int count =1;
        while(step<=nums.length){
            if(nums[step]==0){
                break;
            }
            step = step+nums[step];
            count++;
        }
        return count-1;

    }
}