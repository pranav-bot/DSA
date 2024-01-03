#include <bits/stdc++.h>
using namespace std;

bool isGood(vector<int> &nums)
{
    sort(nums.begin(), nums.end());
    int n = nums.size();
    if (n-1 != nums[n - 1])
    {
        return false;
    }
    if (nums[n - 1] != nums[n - 2])
    {
        return false;
    }
    for (int i = 0; i != n - 2; i++)
    {
        if (nums[i] != i + 1)
        {
            return false;
        }
    }

    return true;
}

int main()
{
    vector<int> nums;
    nums.push_back(1);
    nums.push_back(3);
    nums.push_back(3);
    nums.push_back(2);
    sort(nums.begin(), nums.end());
    for (auto it : nums)
    {
        cout << it << " ";
    }
    cout << endl;
    cout << (true == isGood(nums));
    cout << true;
    return 0;
}