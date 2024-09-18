import java.util.ArrayList;

class DistinctElement
{
    static int returnDistinctElement(ArrayList<Integer>arr,int n)
    {
        for(int i=1;i<n;++i)
            if(arr.get(i)==arr.get(i-1))
                return arr.get(i);

        return -1;
    }
    public static void main(String[] args) 
    {
        int n = 5;
        ArrayList<Integer>arr = new ArrayList<>(n);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        System.out.println(returnDistinctElement(arr, n));
        
    }
}
