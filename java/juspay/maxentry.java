import java.util.*;
class maxentry
{
public static void main(String [] args) throws Exception
{
	
    int j;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    int e[]=new int[n];

    Arrays.fill(e,0);
 
    for(int i=0;i<n;i++)
    {
        a[i]=in.nextInt();
    }

    for(int i=0;i<n;i++)
    {   
    	int val=a[i];
    	if(val<n && val!=-1)
    	{
    		e[val]++;
    	}
    }


    int maxe=Integer.MIN_VALUE;

    for(int i=0;i<n;i++)
    {
    	maxe=Math.max(maxe,e[i]);
    }
    System.out.println(maxe);
}
}