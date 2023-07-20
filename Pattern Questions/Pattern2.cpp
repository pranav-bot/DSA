/*Solution for the pattern
 *
 * *
 * * *
 * * * *
 * * * * *
 */

#include <bits/stdc++.h>
using namespace std;

void printTriangle(int n)
{
    char x = '*';
    for (int i = 0; i != n; i++)
    {
        for (int j = 0; j != i + 1; j++)
        {
            cout << x << " ";
        }
        cout << endl;
    }
}
int main()
{
    printTriangle(5);
    return 0;
}
