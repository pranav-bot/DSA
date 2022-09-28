import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] a = {9,4,5,8,4};
        int[] b = {4,9,5,4};
        int[] c = intersection(a,b);
        System.out.println(Arrays.toString(c));
        int[] d = new int[2];
    
        d[0]=1;
        System.out.println(Arrays.toString(d));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
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
            ArrayList<Integer> al = new ArrayList<>();
            for(int i=0;i!=a.length;i++){
                if(a[i]==true){
                    if(al.contains(nums2[i])){
                        continue;
                    }
                    al.add(nums2[i]);
                    a[i]=false;
                }
            }
            int[] a2 = new int[al.size()];
            int j=0;
            for(int i:al){
                a2[j++]=i;
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
           ArrayList<Integer> bl = new ArrayList<>();
           for(int i=0;i!=b.length;i++){
            if(b[i]==true){
                if(bl.contains(nums1[i])){
                    continue;
                }
                bl.add(nums1[i]);
                b[i] = false;
            }
           }
           int[] b2 = new int[bl.size()];
           int j=0;
           for(int i:bl){
            b2[j++] = i;
           }
           return b2;

        } 
    }
}