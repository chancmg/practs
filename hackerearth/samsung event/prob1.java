import java.io.*;
import java.util.*;

class prob1
{
	static final int MAX=1000;
	static final int Mod = 1000000007;
	static int[] f=new int[MAX];
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
	
		int N=in.nextInt();
		int Q=in.nextInt();
		int A[]=new int[N+1];
		int[] temparr;
		for(int i=1;i<=N;i++)
		{
			A[i]=in.nextInt();
		}
		
		for(int j=0;j<Q;j++)
		{
			int L=in.nextInt();
			int R=in.nextInt();
			temparr=Arrays.copyOfRange(A,L,R+1);
			//System.out.println(temparr.length);
			int g=gcd(temparr);
			System.out.println(fib(g));


		}

		//System.out.println(findgcd(arr,3));
	}

	private static int fib(int n)
	{
		
		if (n == 0)
			return 0;
		if (n == 1 || n == 2)
			return (f[n] = 1);

		if (f[n]!=0)
			return f[n];

		int k = ((n & 1)==1)? (n+1)/2 : n/2;

		f[n] = ((n & 1)==1)? (fib(k)*fib(k) + fib(k-1)*fib(k-1))
			: (2*fib(k-1) + fib(k))*fib(k);

		return f[n];
	}

	/*private static int gcd(int M, int N)
	{
		if (M == 0)
			return N;
		return gcd(N%M, M)%Mod;
	}

	private static int findgcd(int arr[],int k)
	{
		int res=arr[0];
		for(int i=1;i<k;i++)
			res=gcd(arr[i],res);
		return res;
	}*/
	public static int gcd(int[] numbers) {
        int gcd=1;
        int index=2;
        if(numbers.length==1){
            gcd=numbers[1];
        }
        if(numbers.length>1){
           gcd=euclidGcd(numbers[0],numbers[1]); 
        }
        while(index<numbers.length){
            gcd=euclidGcd(gcd,numbers[index]);
            index++;
        }
        return gcd;
    }
    public static int euclidGcd(int num1,int num2){
        int temp=0;
        while(num2!=0){
            temp=num2;
            num2=num1%num2;
            num1=temp;
        }
        num1=num1<0 ? num1 * (-1):num1;
        return num1;
    }

}