/*Solution for printing
*****
*****
*****
*****
*****
*/
#include <bits/stdc++.h>
using namespace std;
class Solution
{
public:
    void printSquare(int n)
    {
        char x = '*';
        for (int i = 0; i != n; i++)
        {
            for (int j = 0; j != n; j++)
            {
                cout << x << ' ';
            }
            cout << endl;
        }
    }
};
void printSquare(int n)
{
    char x = '*';
    for (int i = 0; i != n; i++)
    {
        for (int j = 0; j != n; j++)
        {
            cout << x;
        }
        cout << endl;
    }
}
int main()
{
    printSquare(5);
    return 0;
}