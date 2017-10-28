import java.util.*;
import java.io.*;

class frogjump{
  
  public static void main(String args[])
  {
  int r[][];
  int d[][];
  int c[][];
  int m,n;
  int max=1000000000;
  Scanner in=new Scanner(System.in);
  m=in.nextInt();
  n=in.nextInt();

	r=new int[m][n];
	d=new int[m][n];
	c=new int[m][n];  

  		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				r[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				d[i][j]=in.nextInt();
			}
		}


	for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j]=max;
			}
		}
		c[0][0]=0;
	for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				int t=r[i][j];
				int k=j+1;
				while(k<=j+t)
				{
					if(j+t<n)
					{
						c[i][k]=min(c[i][k],t);
					}
					k+=1;
				}
			}
		}
			for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				int t=d[i][j];
				int k=i+1;
				while(k<=i+t)
				{
					if(i+t<m)
					{
						c[k][j]=min(c[k][j],t);
					}
					k+=1;
				}
			}
		}

	System.out.println(c[m-1][n-1]);



  }
  static int min(int a,int b)
  {
    return a<b?a:b;
  }
}
