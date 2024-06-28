package SequentialDigits;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public static void main(String[] args) {
        System.out.println(sequentialDigits(1000, 13000));
    }
    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String general  = "123456789";
        int count1 = 0;
        int t1 = low;
        while (t1>0) {
            count1++;
            t1 /=10;
        }
        int count2 = 0;
        int t2 = high;
        while (t2>0) {
            count2++;
            t2 /=10;
        }
        for(int i=count1;i!=count2+1;i++){
            for(int j=0;j!=general.length()-i+1;j++){
                int num = Integer.parseInt(general.substring(j,i+j));
                if(num>=low && num<=high){
                    ans.add(num);
                }
            }
        }
        return ans;
    }
}