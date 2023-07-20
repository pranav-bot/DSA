#include <bits/stdc++.h>
using namespace std;

bool isPalindrome(int x)
{
    if (x < 0)
    {
        return false;
    }
    int y = x;
    int rev = 0;
    while (y != 0)
    {
        if (rev > INT_MAX / 10)
        {
            return false;
        }
        rev = rev * 10 + (y % 10);
        y /= 10;
    }
    return rev == x;
}