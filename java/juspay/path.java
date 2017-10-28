import java.util.Scanner;
class path 
{
public static void main(String [] args)
{
	int lp=-1;
    int j;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];

    // read input 
    for(int i=0;i<n;i++)
    {
        a[i]=in.nextInt();
    }

    for(int i=0;i<n;i++)
    {   
    	j=i;
        int count=0;

        while(true)
        {   
            count++;
            if(a[j]==-1)
            {
                break;
            }
            else if(i==a[j])
            {
                if(count>lp)
                lp=count;
                break;
            }
            else
            {   int temp=j;
                j=a[j];
                a[temp]=-1;                 
            }
        }
    }
    System.out.println(lp);
}
}