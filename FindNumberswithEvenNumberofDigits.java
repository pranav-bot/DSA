//The logic here is to count the number of digits of each element of the nums array and store the values in another
//array and then use simple if else logic to count the number of even values in the 2nd array.

public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int[] nums={100000,10};
        System.out.println(NumberswithEvenNumbers(nums));
    }
    static int NumberswithEvenNumbers(int[] nums){
        int digitcount=0;
        int count=0;
        int[] ans= new int[nums.length];
        for(int i=0;i!=nums.length;i++){
            int j=nums[i];
            digitcount=0;
            while(j>0){
                int rem=j%10;
                digitcount++;
                j=j/10;
            }
            ans[i]=digitcount;

        }
        for(int i=0;i!= ans.length;i++){
            if(ans[i]%2==0){
                count++;
            }
        }
        return count;
    }
}

