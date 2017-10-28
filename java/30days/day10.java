import java.util.*;
import java.io.*;

class day10{
  public static void main(String args[])
  {
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // int x=n;
    // int cnt=0;
    // while(x>0)
    // {
    //   x=(x&(x<<1));
    //   cnt++;
    // }
    // System.out.println(cnt);
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i=1;i<=n;i++)
    {
       for(int j=1;j<=n;j++)
       {
           if(j>n-i)
           {
               System.out.print("#");
           }
           else{
            System.out.print(" ");
           }
           
       }
       System.out.print("\n");
    }

  }
}
