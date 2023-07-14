#include <bits/stdc++.h>
using namespace std;

class Solution
{
public:
    vector<bool> kidsWithCandies(vector<int> &candies, int extraCandies)
    {
        vector<bool> ans;
        int max = 0;
        for (int i = 0; i != candies.size(); i++)
        {
            if (candies[i] > max)
            {
                max = candies[i];
            }
        }
        for (int i = 0; i != candies.size(); i++)
        {
            if (candies[i] + extraCandies >= max)
            {
                ans.push_back(1);
            }
            else
            {
                ans.push_back(0);
            }
        }
        return ans;
    }
};