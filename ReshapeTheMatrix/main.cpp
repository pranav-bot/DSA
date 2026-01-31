#include<iostream>
#include<vector>
using namespace std;

vector<vector<int>> matrixReshape(vector<vector<int>>& mat, int r, int c) {
    if (mat.size()*mat[0].size() != r*c){
        return mat;
    }
    int p = 0;
    int q = 0;
    vector<vector<int>> ans(r, vector<int> (c));
    for (int i = 0; i < mat.size(); i++){
        for(int j = 0; j<mat[0].size();j++){
            ans[p][q] = mat[i][j];
            q++;
            if(q==c){
                q = 0;
                p++;
            }
        }
    }
    return ans;
    
        
    }

int main(){
    return 0;
}