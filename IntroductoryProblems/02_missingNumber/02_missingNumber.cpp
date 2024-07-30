//https://cses.fi/problemset/task/1083
#include<bits/stdc++.h>
using namespace std;

int missingNumber(int n)
{
    int x;
    int xorr = 0;
    for(int i=1;i<=n;i++)
        xorr^=i;
    cout<<xorr;
    for(int i=0;i<n-1;++i)
    {
        cin>>x;
        xorr ^= x;
    }
    return xorr;
        

}

int main()
{
    int n;
    scanf("%d",&n);
    int ans = missingNumber(n);
    cout<<ans;
    return 0;

}