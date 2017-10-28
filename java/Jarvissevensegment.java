import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

 class Jarvissevensegment {

	public static void main(String args[]) throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int t,size_of_array,ans;
		int a[];
		t=Integer.parseInt(in.readLine());
		
		for(int i=0;i<t;i++)
		{
			
			size_of_array=Integer.parseInt(in.readLine());
			a=new int[size_of_array];
			for(int j=0;j<size_of_array;j++){
				a[j]=s.nextInt();
			}
			ans=a[0];
			
			for(int k=0;k<size_of_array;k++)
			{
			if(a[k]==1)
			{
				ans=1;
			}
			else if(a[k]==7 && ans!=1)
			{
				ans=7;
			}
		
			else if(a[k]==2 || a[k]==3 || a[k]==5 || a[k]==6 || a[k]==9)
			{
				if(a[k]<ans && ans!=7 && ans!=1)
				{
					ans=a[k];
				}
				
			}
			
			else if(a[k]==0)
			{
				if(a[k]>=ans || ans==8)
				{
					ans=a[k];
				}
				
			}
			
			}
			
			System.out.println(String.valueOf(ans));
		}
	}

}
