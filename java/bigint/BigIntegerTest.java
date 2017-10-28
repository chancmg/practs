import java.math.BigInteger;
import java.util.Scanner;

class BigIntegerTest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many numbers do you need to draw");
        int k=sc.nextInt();

        System.out.println("What is the highest nuymber you can draw");
        int n=sc.nextInt();

        BigInteger odds=BigInteger.valueOf(1);
        for(int i=1;i<=k;i++)
            odds=odds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));

        System.out.println(odds);
    }
}