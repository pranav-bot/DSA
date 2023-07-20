/*Solution for
 1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
#include <bits/stdc++.h>
using namespace std;

void printTriangle(int n)
{

    for (int i = n; i != 0; i--)
    {
        for (int j = 0; j != i; j++)
        {
            cout << j + 1 << ' ';
        }
        cout << endl;
    }
}

int main()
{
    printTriangle(5);
    return 0;
}