////https://cses.fi/problemset/task/1083

import java.util.Scanner;

class missingNumber
{
    public static int missingNumberr(int n,Scanner sc)
    {
        int xor = 0;
        for(int i=1;i<=n;i++)
            xor ^= i;
        for(int i=0;i<n-1;++i)
        {
            int x = sc.nextInt();
            xor ^= x;
            
        }
          return xor;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = missingNumberr(n,sc);
        sc.close();
        System.out.println(ans);

        
    }
}