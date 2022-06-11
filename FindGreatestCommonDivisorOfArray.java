//The logic here is to first find the max and min number of the aray and then use loops to fo find the gcd between them
public class FindGreatestCommonDivisorOfArray {
    public static void main(String[] args) {
        int[] a ={2,5,6,9,10};
        System.out.println(findGCD(a));
    }
    static int findGCD(int[] nums){
        int max=nums[0];
        int min=nums[0];
        int gcd=0;
        for(int i=1;i!= nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        for(int i=0;i!= nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
        }
        for(int i=1;i<=max && i<=min;i++){
            if(max%i==0 && min%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}
