import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String db[][]=new String[N][2];
        String out[]=new String[N];
        
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<2;j++)
            {
                db[i][j]=sc.next();
            }
            
        }
        Pattern p=Pattern.compile("^[\\w.+\\-]+@gmail\\.com$");
        Matcher m;
        int count=0;
        for(int k=0;k<N;k++)
        {
            
            m=p.matcher(db[k][1]);
           
           if(m.matches())
           {   
            out[count]=db[k][0];
            count++;
           } 
            
        }

        Arrays.sort(out, 0, count);
       
        for(int i=0;i<count;i++)
        {
            System.out.println(out[i]);
        }
        

        
        
    }
}