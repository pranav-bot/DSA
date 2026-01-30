#include<iostream>
using namespace std;

    int passThePillow(int n, int time) {
        int pos = 1;
        int dir = 1;

        while(time!=0){
            if(pos==n){
                dir = -1;
            }
            else if(pos==1){
                dir = 1;
            }
            pos+=dir;
            time --;
        }
        return pos;
    }

int main(){
    return 0;
}