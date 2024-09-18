import java.util.Scanner;
class Repetitions 
{

    public static int repetitions(String s)
    {
        int n = s.length();
        int curr = 0;
        int best = 0;
        for(int i=1;i<n;++i)
        {
            if(s.charAt(i)==s.charAt(i-1))
                curr ++;
            else
                curr =1;
            best =Math.max(curr,best);
            
        }
        return best;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println(repetitions(s));
        


    }
}
