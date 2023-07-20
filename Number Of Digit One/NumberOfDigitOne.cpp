//Works but time limit exceeds

#include <bits/stdc++.h>
using namespace std;

int countDigitOne(int n)
{
    int count = 0;
    for (int i = 1; i != n; i++)
    {
        int t = i;
        while (t > 0)
        {
            if (t % 10 == 1)
            {
                count++;
            }
            t /= 10;
        }
    }
    return count+1;
}

int main()
{
    cout << countDigitOne(13);
    return 0;
}