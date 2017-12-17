import java.util.*;
import java.math.*;
class listtest{
  public static void main(String args[])
  {
    int k=3;
    System.out.println(k);
      int i=k-1;

    long sum =(k*(k+1))/2;
    System.out.println(sum);
    long skip=(i*(i+1))/2;
    System.out.println(skip);
    System.out.println((long)(sum*sum)-(skip*skip));
  }
}
