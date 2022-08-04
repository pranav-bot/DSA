import java.util.Arrays;

public class sortTheJumbledNumbers {
    public static void main(String[] args) {
        int[] nums = {991,338,31};
        int[] mapping = {8,9,4,0,2,1,3,5,7,6};
        System.out.println(Arrays.toString(sortJumbled(mapping, nums)));

        
    }
    public static int[] sortJumbled(int[] mapping, int[] nums){
        int[] changedArr = new int[nums.length];
        for(int i=0;i!=nums.length;i++){
            changedArr[i] = digitChager(mapping, nums[i]);
        }
        int[] ans = new int[changedArr.length];
        ans = insertionSort(changedArr);
    }
    public static int digitChager(int[] mapping, int nums){
        int count =0;
        int temp = nums;
        while(temp>0){  
            temp = temp/10;
            count++;
        }
        int[] digit = new int[count];
        for(int i=0;i!=digit.length;i++){
            digit[digit.length-i-1] = nums%10;
            nums = nums/10;
        }
        for(int i=0;i!=digit.length;i++){
            digit[i] = mapping[digit[i]];
        }
        int finalDigit = 0;
        for(int i=0;i!=digit.length;i++){
            finalDigit = finalDigit*10+digit[i];
        }

        return finalDigit;  
    }
    public static int[] insertionSort(int[] arr){
        for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr, j, j-1);
                }
                else{break;}
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int first, int seccond){
        int temp = arr[first];
        arr[first] = arr[seccond];
        arr[seccond] =temp;
    }
    
}