import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class bitand {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int out[]=new int[t];
        int inarr[];
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            inarr=new int[n];
            int c=1;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                inarr[i]=c;
                c++;
            }

            for(int j=0;j<n;j++)
            {
                
                for(int ak=j+1;ak<n;ak++)
                {
                    int val=inarr[j]&inarr[ak];
                    if(val<k && val>max)
                    {
                        max=val;
                    }
                }
            }
            out[a0]=max;
        }
        for(int a:out)
        {
            System.out.println(a);
        }
    }
}