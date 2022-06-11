//the logic here is to bruteforce check for duplicate of each element
public class NumberofGoodPairs {
    public static void main(String[] args) {
        int[] nums={1,1,1,1};
        System.out.println(GoodPairs(nums));
    }
    static int GoodPairs(int[] nums){
        int ans = 1;
        int count = 0;
        for(int i=0;i!= nums.length;i++){
            for (int j=i+1;j!= nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
    }
        return count;

    }
}

