import java.util.*;
import java.io.*;

class loops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int arr[]=new int[n];
            int sum=0,cursum=0;
            for(int j=0;j<n;j++)
            {
                int part=(int)(Math.pow(2,j)*b);
                cursum+=part;
                sum=a+cursum;
                arr[j]=sum;
            }
            for(int s:arr)
            {
                System.out.print(s+" ");
            }
            System.out.println("");
            
        }

        in.close();
    }
}
