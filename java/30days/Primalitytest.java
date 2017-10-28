import java.io.*;
import java.util.*;

class Primalitytest{
  public static void main(String args[])
  {
    String s=isprime(15) ? "Prime":"Not prime";

    System.out.println(s);
  }

  public static boolean isprime(long n)
  {
    if(n<=1)
      return false;

    if(n<=3)
      return true;

    if(n%2==0 || n%3==0)
      return false;

    for(long i=5;i*i<=n;i=i+6)
    {
      if(n%i==0||n%(i+2)==0)
        return false;
    }

    return true;
  }
}
