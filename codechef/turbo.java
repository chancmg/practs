import java.util.*;
class turbo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int b;
        int N=sc.nextInt();
        int arr[]=new int[1000001];

        Arrays.fill(arr,0);
        while(N>0)
        {
            b=sc.nextInt();
            arr[b]++;
            N--;
        }

        for(int i=0;i<1000001;i++)
        {
            if(arr[i]>0)
            {
                System.out.println(i);
            }
            arr[i]--;
        }
        
    }
}