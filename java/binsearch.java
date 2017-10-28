import java.io.*;


class binsearch
{
	public static void main(String args[]) throws IOException
	{
		int a[]={23,34,12,35,64,22,74,21,13};
		int k=15,l=0,r=a.length;

		// int index=bsearch1(a,k,l,r);
		// System.out.println("Found in index:"+index);
		if(quick(a,l,r))
		{
			for(int i=0;i<r;i++)
			{
				System.out.println(a[i]);
			}
		}

	}

	private static void bsearch(int in[],int val)
	{
		int i=0,n=in.length;

		while(i<n && in[i]!=val)
		{
			i=i+1;
		}
		if(i<n)
		{
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}

	}

	private static  int bsearch1(int in[],int val,int first,int last)
	{

if(first<last)
{
		int mid=first+(last-first)/2;

		if(val<in[mid])
		{
		return	bsearch1(in,val,first,mid);
		}
		else if(val>in[mid])
		{
		return	bsearch1(in,val,mid+1,last);
	}
	else
	{
		return mid;
	}
}
	return -(first+1);
	}

private static boolean quick(int in[],int l,int r)
{
int y=l+1;
int g;
if(l<r){


for(g=l+1;g<r;g++)
{
	if(in[g]<=in[l]){
		swap(in,y,g);
		y++;
	}
swap(in,l,y-1);
quick(in,l,y);
quick(in,y+1,r);

}

}
return true;
}

private static void swap(int array[],int i, int j) {
			 int temp = array[i];
			 array[i] = array[j];
			 array[j] = temp;
	 }
}
