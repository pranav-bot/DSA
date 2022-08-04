import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.management.relation.InvalidRelationIdException;

public class relativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {26,21,11,20,50,34,1,18};
        int[] arr2 = {21,11,26,20};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] digitCount = new int[arr2.length];
        for(int i=0;i!=arr2.length;i++){
            int count = 0;
            count = counter(arr1, arr2[i]);
            digitCount[i] = count;
        }
        int sum=0;
        for(int i=0;i!=digitCount.length;i++){
            sum = digitCount[i]+sum;
        }
        int[] arr = arr1.clone();
        int j=0;
        for(int i=0;i!=digitCount.length;i++){
            int limit = digitCount[i]+j;
            while(j<limit){
                arr[j] = arr2[i];
                j++;
            
            }
        }
        int[] temp = arr.clone();
        ArrayList<Integer> missingNumbers = new ArrayList<Integer>();
            for(int i=0;i!=arr1.length;i++){
                if(arr[i]!=arr1[i]){
                    missingNumbers.add(arr1[i]);
                }
            }
            ArrayList<Integer> new_arr = new ArrayList<Integer>();
            for(int i=0;i!=missingNumbers.size();i++){
                if(new_arr.contains(missingNumbers.get(i))==false){
                    new_arr.add(missingNumbers.get(i));
                }
            }
            for(int i=0;i!=arr2.length;i++){
                if(new_arr.contains(arr2[i])){
                    int ind = new_arr.indexOf(arr2[i]);
                    new_arr.remove(ind);
                }
            }
            for(int i=0;i!=new_arr.size();i++){
                arr[sum] = new_arr.get(i);
                sum++;
            }
            if(arr1.length==arr2.length){
                return arr;
            }
            bubbleSort(arr, sum+1, arr.length);
            
            return arr;
        }
        public static int counter(int[] arr, int number){
            int count =0;
            for(int i=0;i!=arr.length;i++){
                if(arr[i]==number){
                count++;
                }
            }
            return count;
        }
        public static void bubbleSort(int[] arr, int start, int end){
            boolean swapped ;
            for(int i=0;i!=end;i++){
                swapped = false;
                for(int j=start;j!=end-i;j++){
                    if(arr[j-1]>arr[j]){
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                        swapped = true;
                    }
                }
                if(!swapped){
                    break;
                }
            }
        }
    }


