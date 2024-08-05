#include<bits/stdc++.h>
using namespace std;

int returnDistinctElement(vector<int>&arr,int n)
{
    sort(arr.begin(),arr.end());
    for(int i=1;i<n;i++)
        if(arr[i]==arr[i-1])
            return arr[i];
    return -1;
}

int main()
{
    int n = 5;
    vector<int>arr =  {2, 3, 2, 2, 3};
    cout<<returnDistinctElement(arr,n);

    return 0;
}