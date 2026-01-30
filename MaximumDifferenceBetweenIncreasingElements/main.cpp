#include<iostream>
#include<vector>
using namespace std; 

int maximumDifference(vector<int>& nums) {
    int l = 0;
    int r = 1;
    int ans = -1;
    while(r!=nums.size()){
        int temp = -1;
        if(nums[r]>nums[l]){
            temp = nums[r]-nums[l];
        }
        else{
            l = r;
        }
        if(temp>ans){
            ans = temp;
        }
        r++;
    }
    return ans;

}


int main(){
    vector<int> nums = {7,1,5,4};
    cout<<maximumDifference(nums);
    return 0;
}

