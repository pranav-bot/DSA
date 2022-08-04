public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(MajorityElements(nums));
        
    }
    public static int MajorityElements(int[] nums){
        bubbleSort(nums);
        int m = nums[nums.length/2];
        return m;
    }
    public static void bubbleSort(int[] arr){
        boolean swapped;
        for(int i=0;i<=arr.length;i++){
            swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
        
    }
