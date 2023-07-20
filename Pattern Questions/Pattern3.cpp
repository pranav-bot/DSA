/*Solution for
1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/

#include <bits/stdc++.h>
using namespace std;

void printTriangle(int n)
{
    for (int i = 1; i != n + 1; i++)
    {
        for (int j = 1; j != i + 1; j++)
        {
            cout << j << ' ';
        }
        cout << endl;
    }
}

int main()
{
    printTriangle(5);
    return 0;
}