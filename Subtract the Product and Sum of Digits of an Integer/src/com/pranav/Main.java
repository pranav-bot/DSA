package com.pranav;


class Solution {
    public int subtractProductAndSum(int n) {
        ;
        int b = 0;
        int c = 1;
        while(n>0){
            int d = n%10;
            b = b+d;
            c= c*d;
            n = n/10;

        }
        return c-b;

    }
}




	// write your code h
