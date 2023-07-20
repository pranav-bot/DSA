#include <bits/stdc++.h>
using namespace std;

int lastRemaining(int n)
{
    int start = 1;
    int r = n;
    int x = 1;
    bool l = true;
    while (r != 1)
    {
        if (l || r % 2 == 1)
        {
            start = start + x;
        }
        x *= 2;
        r /= 2;
        l = !l;
    }
    return start;
}

int main()
{
    cout << lastRemaining(9);
    return 0;
}