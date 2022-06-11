//Doesn't work
public class JumpGame {
    public static void main(String[] args) {
        int[] a={1,1,2};
        System.out.println(JumpGame(a));


    }
    static boolean JumpGame(int[] nums){
        int[] a={0};
        int apointer=0;
        int steps_remaining=nums.length;
        int i=0;
        while(i!= nums[1]){
            steps_remaining=steps_remaining-nums[nums[i]+1];
            i=nums[nums[i]];
        }
        if(nums==a){
            return true;
        }
        else if(steps_remaining>0){
            return false;
        }
        else{
            return true;
        }
    }
}
