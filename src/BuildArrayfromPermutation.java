//The logic here is to create a new array with its elements being the elements being indexed according to the first array


import java.util.Arrays;

public class BuildArrayfromPermutation {
    public static void main(String[] args) {
        int[] m={0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildarrayfrompermutation(m)));

    }
    static int[] buildarrayfrompermutation(int[] nums){
        int ans[]=new int[nums.length];
        for(int i=0;i!= nums.length;i++){
                ans[i]=nums[nums[i]];
            }

        return ans;
    }
}
