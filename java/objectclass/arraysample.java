import java.util.*;

class arraysample{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[s];

        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }

        for(int j=n;j>0;j--)
        {
            System.out.print(arr[j]+" ");
        }

    }
}