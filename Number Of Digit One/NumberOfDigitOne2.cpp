// Works but leetcode dosent accept

#include <bits/stdc++.h>
using namespace std;

int countDigits(int n, int c)
{
    if (n == 0)
    {
        return c;
    }
    if (n % 10 == 1)
    {
        countDigits(n / 10, c + 1);
    }
    else
    {
        countDigits(n / 10, c);
    }
}

int countDigitOne(int n)
{
    int count = 0;
    for (int i = 1; i != n; i++)
    {
        count = count + countDigits(i, 0);
    }
    return count + 1;
}

int main()
{
    cout << countDigitOne(14);
    return 0;
}