#include <iostream>
#include<vector>
using namespace std;

vector<string> findWords(vector<string>& words) {
    string row1 = "qwertyuiop";
    string row2 = "asdfghjkl";
    string row3 = "zxcvbnm";

    vector<string> ans;
    for(string word: words){
        string lower  = word;
        bool val = true;
        for(char &c: lower){
            c = tolower(c);
        }
        string row;
        if(row1.find(lower[0])!=string::npos){
            row = row1;
        }
        else if (row2.find(lower[0])!=string::npos){
            row = row2;
        }
        else{
            row = row3;
        }
        for(char c: lower){
            if(row.find(c)==string::npos) {
                val = false;
            }
        }
        if(val){
            ans.push_back(word);
        }
        
    }
    return ans;

    }

int main(){
    return 0;
}