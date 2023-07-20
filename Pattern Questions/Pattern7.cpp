/*Solution for
 *
 ***
 *****
 *******
 *********
 */

#include <bits/stdc++.h>
using namespace std;

void printTriangle(int n)
{
    char x = '*';
    for (int i = 0; i != n; i++)
    {
        for (int j = 0; j < n - i - 1; j++)
        {
            cout << " ";
        }
        for (int j = 0; j < 2 * i + 1; j++)
        {

            cout << x;
        }
        for (int j = 0; j < n - i - 1; j++)
        {
            cout << " ";
        }
        cout << endl;
    }
}

int main()
{
    printTriangle(5);
    return 0;
}