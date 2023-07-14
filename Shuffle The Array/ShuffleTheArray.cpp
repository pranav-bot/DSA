#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
    vector<int> shuffle(vector<int> &nums, int n)
    {
        vector<int> ans;
        int temp = n;
        int j = 0;
        for (int i = 0; i != n * 2; i++)
        {
            if (i % 2 != 0)
            {
                ans.push_back(nums[temp]);
                temp++;
            }
            else
            {
                ans.push_back(nums[j]);
                j++;
            }
        }
        return ans;
    }
};