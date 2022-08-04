public class medianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
        
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0){
            double s = 0;
            double e = nums2.length-1;
            return s+(e-s)/2;
        }
        else if(nums2.length==0){
            double s = 0;
            double e = nums1.length-1;
            return s+(e-s)/2;
        }
        double start =0;
        if(nums1[0]>nums2[0]){
            start = nums2[0];
        }
        else{
            start = nums1[0];
        }
        double end =0;
        if(nums1[nums1.length-1]>nums2[nums2.length-1]){
            end = nums1[nums1.length-1];
        }
        else{
            end = nums2[nums2.length-1];
        }
        double mid = start + (end-start)/2;
        double median =0;
        if((nums1.length+nums2.length)%2==0){
            return mid;
        }
        else{
            median = mid;
        }
        return mid;
        
    }
}
