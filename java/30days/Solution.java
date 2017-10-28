import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        String out[]=new String[T];
        String in[]=new String[T];
        for(int i=0;i<T;i++)
        {
            in[i]=sc.next();
        }

        for(String s:in)
        {
            
            char ch[]=s.toCharArray();
            StringBuilder sb=new StringBuilder();
            
            for(int j=0;j<s.length();j+=2)
            {
               sb.append(ch[j]);
            }
            sb.append(" ");
            for(int k=1;k<s.length();k+=2)
            {
                sb.append(ch[k]);
            }
            
            System.out.println(sb);
            
        }       
    }
}