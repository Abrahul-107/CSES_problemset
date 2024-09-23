#include<bits/stdc++.h>
using namespace std;


int main()
{
    int n,k,x;cin>>n>>k>>x;
    vector<long long>desired(n);
    vector<long long>given(k);
    for(int i = 0; i < n; i++) 
        cin >> desired[i];
    for(int i = 0; i < k; i++) 
        cin >> given[i];
    
    sort(desired.begin(),desired.end());
    sort(given.begin(),given.end());

    int i=0,j=0,c =0;
    while(i<n && j<k)
    {
        if(abs(desired[i]-given[j])<=x)
        {
            c++;i++;j++;
        }
        else if(desired[i]<given[j])
            i++;
        else
            j++;
    }
    cout<<c;

    return 0;

}