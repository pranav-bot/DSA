/*Solution for 
* * * * *
* * * *
* * *
* *
*
*/
#include <bits/stdc++.h>
using namespace std;

void printTriangle(int n)
{
    char x = '*';
    for (int i = n; i != 0; i--)
    {
        for (int j = i; j != 0; j--)
        {
            cout << x << ' ';
        }
        cout << endl;
    }
}

int main()
{
    printTriangle(1);
    return 0;
}