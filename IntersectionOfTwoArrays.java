import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] a = {1,2,2,1};
        int[] b = {1,2};
        System.out.println(Arrays.toString(intersection(a, b)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m > n) {
            int tempp[] = nums1;
            nums1= nums2;
            nums2 = tempp;
 
            int temp = m;
            m = n;
            n = temp;
        }
        Arrays.sort(nums1);
        int count=0;
        for (int i = 0; i < n; i++) {
            if (binarySearch(nums1, 0, m - 1, nums2[i]) != -1)
            count=i;
        }
        int[] ans = new int[count];
        for (int i = 0; i < n; i++) {
            if (binarySearch(nums1, 0, m - 1, nums2[i]) != -1)
            ans[i]=nums2[i];
        }
        return ans;
    }

    public static int commonNumbers(int[] nums1, int[] nums2){
        int count =0;
        for(int i=0;i!=nums1.length;i++){
            for(int j=0; j!=nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    count++;
                    break;
                }
                if(j>0){
                    if(nums2[j]==nums2[j-1]){
                        count=count-1;
                    }
                } 
            }
            if(i>0){{
                if(nums1[i]==nums1[i-1]){
                    count=count-1;
                }
            }
            }
        
            }
            return count;
    }


    public static int binarySearch(int[] arr,int target,  int start, int end){
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if (target>arr[mid]){
                start= mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}