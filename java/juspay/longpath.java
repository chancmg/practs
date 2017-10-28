import java.util.Scanner;
class longpath 
{
public static void main(String [] args) throws Exception
{
	int lp=-1;
    int j;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];

 
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
         if(j<n)
         {
            if(a[j]==-1)
            {
            	//lp=-1;
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
        else
        {
        	break;
        }

    	}
    }
    System.out.println(lp);
}
}