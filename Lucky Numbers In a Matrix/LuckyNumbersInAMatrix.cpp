#include <bits/stdc++.h>
using namespace std;

vector<int> luckyNumbers(vector<vector<int>> &matrix)
{
    vector<int> v;
    int n = matrix.size();
    int m = matrix[0].size();
    for (int i = 0; i != n; i++)
    {
        for (int j = 0; j != m; j++)
        {
            bool max = true;
            bool min = true;
            for (auto it : matrix[i])
            {
                if (matrix[i][j] > it)
                {
                    min = false;
                }
            }
            if (min)
            {
                for (auto it : matrix)
                {
                    if (matrix[i][j] < it[j])
                    {
                        max = false;
                    }
                }
            }
            if (max && min)
            {
                v.push_back(matrix[i][j]);
            }
        }
    }
    return v;
}

int main()
{
    return 0;
}