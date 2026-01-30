#include<iostream>
using namespace std;

string makeSmallestPalindrome(string s) {
    int l = 0;
    int r = s.length()-1;
    string ans = s;
    while(r>l){
        char c = ans[l] < ans[r] ? ans[l] : ans[r];
        ans[l++] = c;
        ans[r--] = c;
    }
    return ans;        
}

int main(){
    return 0;
}

