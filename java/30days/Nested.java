import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Nested {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int da,ma,ya,de,me,ye;
        int fine=0;
        da=sc.nextInt();
        ma=sc.nextInt();
        ya=sc.nextInt();
        de=sc.nextInt();
        me=sc.nextInt();
        ye=sc.nextInt();

        if(de<da && ma==me && ya==ye)
        {
            fine=15*(da-de);
        } 
        else if(ma>me && ya==ye)
        {
            fine=500*(ma-me);
        }
        else if(ya>ye)
        {
            fine=10000;
        }

        System.out.println(fine);

    }
}