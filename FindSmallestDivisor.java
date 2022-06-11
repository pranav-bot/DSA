public class FindSmallestDivisor {
    public static void main(String[] args) {
        int[] n = {1,2,5,9};
        System.out.println(smallestDivisor(n, 6));
        
    }
    public static int smallestDivisor(int[] nums, int threshold){
        int sum = 0;
        int temp2=0;
       for(int i=1;i!=threshold;i++){
           int[] temp = nums;
           temp = arrayDivide(nums, i);
           temp2 = sum;
           sum =0;
           for(int j=0;j!=temp.length;j++){
               sum = sum + temp[j];
           }
           
           if(temp2>sum){
               temp2=sum;
           }
       }
       return temp2;
    }
    public static int[] arrayDivide(int[] nums, int n){
        for(int i=0;i!=nums.length;i++){
            nums[i] = nums[i]/n;
        }
        return nums;
    }
    
}
