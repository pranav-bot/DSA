public class intersectionOfTwoArrays2 {
    public static void main(String[] args) {
        
    }
    public static int[] intersect(int[] nums1, int[] nums2){

        boolean[] a = new boolean[nums2.length];
        boolean[] b = new boolean[nums1.length];
        if(nums1.length>nums2.length){
            for(int i=0;i!=nums2.length;i++){
                for(int j=0;j!=nums1.length;j++){
                    if(nums2[i]==nums1[j]){
                        a[i]=true;
                    }
                }
            }
            int counter=0;
            for(int i=0;i!=a.length;i++){
                if(a[i]==true){
                    counter++;
                }
            }
            int[] a2 = new int[counter];
            for(int i=0;i!=a2.length;i++){
                for(int j=0;j!=a.length;j++){
                    if(a[j]==true){
                        a2[i]=nums2[j];
                        a[j] = false;
                        break;
                    }
                }
            }
            return a2;
        }
        else{
            for(int i=0;i!=nums1.length;i++){
                for(int j=0;j!=nums2.length;j++){
                    if(nums1[i]==nums2[j]){
                        b[i]=true;
                    }
                }
            }
            int counter =0;
            for(int i=0;i!=b.length;i++){
                if(b[i]==true){
                    counter++;
                }
            }
            int[] b2 = new int[counter];
            for(int i=0;i!=b2.length;i++){
                for(int j=0;j!=b.length;j++){
                    if(b[j]==true){
                        b2[i]=nums1[j];
                        b[j] = false;
                        break;
                    }
                }
            }
            return b2;
        } 
    }
}
