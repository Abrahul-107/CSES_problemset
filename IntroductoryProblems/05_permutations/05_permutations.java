import java.util.Scanner;

class Permutations
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if(n==1)
            System.out.println(1);
        else if(n<=3)
            System.out.println("NO SOLUTION");
        else
        {
            for(int i=2;i<=n;i+=2)
                System.out.print(i+" ");
            for(int j=1;j<=n;j+=2)
                System.out.print(j+" ");
        }


        
    }
}