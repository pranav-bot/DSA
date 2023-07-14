#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
    vector<int> getConcatenation(vector<int> &nums)
    {
        vector<int> ans;
        int index = 0;
        for (int i = 0; i != nums.size() * 2; i++)
        {
            if (i == nums.size())
            {
                index = 0;
            }
            ans.push_back(nums[index]);
            index++;
        }
    }
};