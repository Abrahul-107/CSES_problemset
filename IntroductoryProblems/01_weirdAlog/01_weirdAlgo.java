import java.util.Scanner;

class weirdAlgo
{
    public static void weirdAlgoithm(int n)
    {
        while(n>1)
        {
            System.out.println(n);
            if((n & 1) == 1)
                n = n*3+1;
            else
                n >>=1;
        }
        System.out.println("1");

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        weirdAlgoithm(n);


        
    }
}