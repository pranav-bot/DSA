import java.util.Arrays;
import java.util.function.ToDoubleBiFunction;

public class mergeSort {
    public static void main(String[] args) {
        int[] a = {5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(a)));
        inplacemergeSort(a, 0, a.length);
        System.out.println(Arrays.toString(a));
        
    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right  = mergeSort(Arrays.copyOfRange(arr, mid, arr.leng  th));

        return merge(left, right);
    }
    static void inplacemergeSort(int[] arr, int start,int end){
        if(end-start==1){
            return;
        }
        int mid = (start + end)/2;
        inplacemergeSort(arr, start, mid);
        inplacemergeSort(arr, mid, end);

        mergeinplace(arr,start,mid,end);

    }
    private static int[] merge(int[] left, int[] right) {
        int[] ans = new int[left.length+right.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<left.length && j<right.length){
            if(left[i]>right[j]){
              ans[k] = right[j];
              j++;
            }
            else{
                ans[k] = left[i];
                i++;
            }
            k++;
        }
        while(i<left.length){
            ans[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            ans[k] = right[j];
            j++;
            k++;
        }
        return ans;


        
    }
    public static void mergeinplace(int[] arr, int s, int m , int e) {
        int i=s;
        int j = m;
        int k=0;
        int[] ans = new int[e-s];

        while(i<m && j<e){
            if(arr[i]>arr[j]){
                ans[k] = arr[j];
                j++;
                k++;
            }
            else{
                ans[k] = arr[i];
                i++;
                k++;
            }
        }
        while(i<m){
            ans[k] = arr[i];
            i++;
            k++;
        }
        while(j<e){
            ans[k] = arr[j];
            j++;
            k++;
        }
        for(int l=0;j!=ans.length;i++){
            arr[s+l] = ans[l];
        }
    }
    
}
