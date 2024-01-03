#include <bits/stdc++.h>
using namespace std;

long long maxScore(vector<int> &nums, int x)
{
    long long eSum = 0;
    long long oSum = 0;
    long long ans;

    for (int i = 0; i != nums.size(); i++)
    {
        if (nums[i] % 2 == 0)
        {
            eSum = eSum + nums[i];
        }
        if (nums[i] > x && nums[i] % 2 != 0)
        {
            eSum = eSum + nums[i] - x;
        }
        if (nums[i] % 2 != 0)
        {
            oSum = oSum + nums[i];
        }
        if (nums[i] > x && nums[i] % 2 == 0)
        {
            oSum = oSum + nums[i] - x;
        }
    }
    oSum > eSum ? ans = oSum : ans = eSum;
    return ans;
}

int main()
{
    vector<int> nums{38, 92, 23, 30, 25, 96, 6, 71, 78, 77, 33, 23, 71, 48, 87, 77, 53, 28, 6, 20, 90, 83, 42, 21, 64, 95, 84, 29, 22, 21, 33, 36, 53, 51, 85, 25, 80, 56, 71, 69, 5, 21, 4, 84, 28, 16, 65, 7};
    cout << maxScore(nums, 52) << endl;
    cout << nums[43];
    return 0;
}
