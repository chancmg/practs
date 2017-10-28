import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner s=new Scanner(System.in);
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            long n = s.nextLong();
            int k = s.nextInt();

            long out_ = solve(k, n);
            System.out.println(out_);
            System.out.println("");
         }

         wr.close();
         br.close();
    }
    static long solve(int k, long n){
        long sum=0;
        for(int i=0;i<=n;i++)
        {
            if(i==0)
            {
                sum=1;
            }
            else
            {
                String temp=dectobase(i,k);
                sum=sum+temp.length();
            }

        }
        return sum;
    
    }
    static String dectobase(int dec,int b)
    {
        int q=dec,r;
        String ans="";
        while(q!=0)
        {
        r=q%b;
        ans=r+ans;
        q=q/b;
        }
        return ans;
    }
}