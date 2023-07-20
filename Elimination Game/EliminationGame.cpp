/*
This Solution works but goves null pointer error in leetcode compiler
*/

#include <bits/stdc++.h>
using namespace std;

int lastRemaining(int n)
{
    vector<int> v;
    for (int i = 1; i != n; i++)
    {
        v.push_back(i);
    }

    while (v.size() > 1)
    {
        int x = (v.size() / 2) + 1;
        if (v.size() % 2 == 0)
        {
            x = v.size() / 2;
        }

        for (int j = 0; j < x; j++)
        {
            v.erase(v.begin() + j);
        }
        reverse(v.begin(), v.end());
    }
    return v[0];
}

int main()
{
    cout << lastRemaining(15);
    return 0;
}