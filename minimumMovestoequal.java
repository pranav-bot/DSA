public class minimumMovestoequal {
    public static void main(String[] args) {
        int[] nums = {5,6,8,8,5};
        System.out.println(minMoves2(nums));
        //System.out.println(minMoves(nums));
    }
    public static int minMoves(int[] nums){
        int n = nums.length;
        int sum = 0;
        if(nums.length==2){
            if(nums[0]>nums[1]){
                return (nums[0]-nums[1]);
            }
            else return(nums[1]-nums[0]);
        }
        if(n==1){
            return 0;
        }
        int min = nums[0];
        int low =1;
        for(int i=0;i!=n;i++){
            sum = sum +nums[i];
        }
        if(min>n){
            min =n;
        }
        if(min==0){
            low =0;
        }
        while(low*n!=sum){
            low++;
            sum = sum+(n-1);
        }
        return low-min;
    }
    public static int minMoves2(int[] nums){
        int positionofmax = findMAx(nums);
        int positionofmin = findMin(nums);
        int steps = 0;
        int increment =0;
        while(allElemsSame(nums)==false){
            positionofmax = findMAx(nums);
            positionofmin = findMin(nums);
            increment = nums[positionofmax] - nums[positionofmin];
            steps = steps+increment;
            for(int i=0;i!=nums.length;i++){
                if(i!=positionofmax){
                    nums[i] = nums[i]+increment;
                }
            }
        }
        return steps;
    }
    public static boolean allElemsSame(int[] nums){
        for(int i=1;i!=nums.length;i++){
            if(nums[0]!=nums[i]){
                return false;
            }
        }
        return true;
    }
    public static int findMAx(int[] nums){
        int max = nums[0];
        int posi=0;
        for(int i=1;i!=nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
                posi = i;
            }
        }
        return posi;
    }
    public static int findMin(int[] nums){
        int min = nums[0];
        int posi = 0;
        for(int i=1;i!=nums.length;i++){
            if(min>nums[i]){
                min = nums[i];
                posi =i;
            }
            
        }
        return posi;
    }
}