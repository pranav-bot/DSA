package TheNumberOfSmallestUnoccupiedChair;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class TheNumberofSmallestUnnocupiedChair {
    public static void main(String[] args) {

        int[][] times = {{3,10},{1,5},{2,6}};
        int targetFriend = 0;
        System.out.println(smallestChair(times, targetFriend));


    }

    public int LargestChair(int[][] times) {
        int max = 0;
        for (int i = 0; i < times.length; i++) {
            for (int j = 0; j < times[0].length; j++) {
                if (times[i][j] > max) {
                    max = times[i][j];
                }
            }
        }
        return max;
    }
    // public int smallestChair(int[][] times, int targetFriend) {
    // int num_f = times.length;
    // int maxT = LargestChair(times);
    // int ans = Integer.MAX_VALUE;
    // Hashtable<Integer, List<Integer>> h = new Hashtable<>();
    // List<Integer> l = new ArrayList<>();
    // for (int time = 1; time < maxT; time++) {
    // l.add(time);
    // }

    // for (int i = 0; i < times.length; i++) {
    // for (int j = times[i][0]; j < times[i][1]; j++) {
    // if(l.contains(j)){
    // l.remove(j);
    // }
    // }
    // h.put(i, l);
    // }
    // int e = times[targetFriend][0];

    // }
    public static int smallestChair(int[][] times, int targetFriend) {
        int num_f = times.length;
        //sint maxT = LargestChair(times);
        int min = Integer.MAX_VALUE;
        Hashtable<Integer, Integer> h = new Hashtable<>();
        Hashtable<Integer, Integer> h2 = new Hashtable<>();
        Hashtable<Integer, Integer> h3 = new Hashtable<>();
        //int ans = 0;
        for (int i = 0; i < times.length; i++) {
            h.put(i, times[i][0]);
        }
        for (int i = 0; i < times.length; i++) {
            h2.put(i, times[i][1]);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(h.entrySet());
        list.sort(Map.Entry.comparingByValue());
        //int t = 0;
        // for (int i = 0; i < list.size(); i++) {
        //     if(list.get(i).getKey()==targetFriend){
        //         ans =  i;
        //         t = list.get(i).getValue();
        //     }
        // }
        List<Map.Entry<Integer, Integer>> list2 = new ArrayList<>(h2.entrySet());
        list2.sort(Map.Entry.comparingByValue());
        // for (int i = 0; i < list2.size(); i++) {
        //     if(list2.get(i).getValue()<t){
        //         if(ans>i){
        //             ans = i;
        //         }
        //     }
        // }
        for (int i = 0; i < times.length; i++) {
            int t = 0;
            int c = 0;
            int ans = 0;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j).getKey()==i){
                    ans =  list.get(j).getKey();
                    t = list.get(j).getValue();
                    c = j;
                }
            }
            for (int j = 0; j < times.length; j++) {
                
                if(list2.get(j).getValue()<t){
                    if(j<c){
                        list.set(j, list.get(j));
                }
            }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getKey()==targetFriend){
                return i;
            }
        }
        return -1;
    }
}
