//https://cses.fi/problemset/task/1094
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class IncreasingArray
{
    public static int minimumMove(ArrayList<Integer>arr)
    {
        int count = 0;

        for(int i=1;i<arr.size();++i)
        {
    
            if(arr.get(i-1)>arr.get(i))
                count += (arr.get(i-1)-arr.get(i));
        }

        return count;
    }
   public static void main(String[] args) 
   {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>arr = new ArrayList<>(Arrays.asList(3,2,5,1,7));
        sc.close();
        System.out.println(minimumMove(arr));
    
   } 
}