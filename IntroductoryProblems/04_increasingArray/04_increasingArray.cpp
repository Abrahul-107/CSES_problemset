//https://cses.fi/problemset/task/1094
#include<bits/stdc++.h>
using namespace std;


int minimumMove(vector<int>&arr)
{
    int count = 0;
    int n = arr.size();
    for(int i=1;i<n;i++)
    {
        if(arr[i]<arr[i-1])
            count += (arr[i-1]-arr[i]);
    }
    return count;
}

int main()
{
    int n = 5;
    vector<int>nums = {3,2,5,1,7};
    cout<<minimumMove(nums);

    return 0;

}