package com.pranav;

public class Main {
    public boolean isPalindrome(int x) {
        int c = 0;
        int temp = x;
        while(temp!=0){
            c= c*10;
            c= c+temp%10;
            temp /= 10;
        }
        if(x==c){
            return true;
        }
        else if(x<0){
            return false;
        }
        else{
            return false;
        }

    }
}
