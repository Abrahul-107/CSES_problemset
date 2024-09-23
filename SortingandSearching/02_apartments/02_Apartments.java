import java.util.*;
class Apartments
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();

        List<Long>desired = new ArrayList<>();
        List<Long>given = new ArrayList<>();

        for(int i=0;i<n;i++)
            desired.add(sc.nextLong());
        for(int i=0;i<k;i++)
            given.add(sc.nextLong());

        Collections.sort(desired);
        Collections.sort(given);
        sc.close();
        int i=0,j=0,c=0;
        while(i<n && j<k)
        {
            if(Math.abs(desired.get(i)-given.get(j))<=x)
            {
                i++;j++;c++;
            }
            else if(desired.get(i)<given.get(j))
                i++;
            else
                j++;
        }
        System.out.println(c);


        
    }
}