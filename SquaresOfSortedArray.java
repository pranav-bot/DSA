public class SquaresOfSortedArray {
    public static void main(String[] args) {
        
    }
    public static int[] sortedSquares(int[] nums){
        int[] ans = new int[nums.length];
        int s =0;
        int e = nums.length-1;
        int i = nums.length-1;
        while(s<=e){
            int m = nums[s] * nums[s];
            int n = nums[e] * nums[e];
            if(m<n){
                ans[i--] = n;
                e--;
            }
            else{
                ans[i--] = m;
                s++;
            }
        }
        return ans;
    }
    
}
