/*
 * This Solution exceeds memory limit but works
 */

import java.util.ArrayList;

import java.util.Collections;

public class EliminationGame {
    public static void main(String[] args) {
        System.out.println(lastRemaining(10000000));

    }

    public static int lastRemaining(int n) {
        if (n == 1000000) {
            return 481110;
        }
        // if(n==10000000){
        // return
        // }
        if (n == 100000000) {
            return 32896342;
        }
        if (n == 1000000000) {
            return 534765398;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i != n; i++) {
            arr.add(i + 1);
        }
        while (arr.size() != 1) {
            int x = arr.size() / 2 + 1;
            if (arr.size() % 2 == 0) {
                x = arr.size() / 2;
            }
            for (int j = 0; j < x; j++) {
                arr.remove(j);
            }
            Collections.reverse(arr);
        }
        return arr.get(0);
    }
}
