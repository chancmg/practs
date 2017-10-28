/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int r=s.nextInt();
		int k=s.nextInt();
		int count=0;

		for(int i=l;i<=r;i++)
		{
			if(i % k==0)
			{
				count+=1;
			}
		}
		System.out.println(count);
	}
}