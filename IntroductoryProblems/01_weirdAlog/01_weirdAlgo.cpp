#include<bits/stdc++.h>
using namespace std;


void weirdAlgorithm(long long n)
{
    while(n>1)
    {
        printf("%lld\n",n);
        if(n&1) 
            n = n*3+1;
        else    
            n >>= 1;
    }
    printf("1\n");
}
int main()
{
    long long n =3;
    weirdAlgorithm(n);

    return 0;
}