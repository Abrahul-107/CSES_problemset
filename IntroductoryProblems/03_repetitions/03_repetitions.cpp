#include<bits/stdc++.h>
using namespace std;

int repetitions(string s)
{
    int n = s.length();
    int curr = 1;
    int best = 1;
    for(int i=1;i<n;i++)
    {
        if(s[i]==s[i-1])
            curr++;
        else
            curr =1;
        best = max(curr,best);
    }
    return best;
}

int main()
{
    string s = "ATTCGGGA";
    int ans = repetitions(s);
    cout<<ans;

    return 0;

}