import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;
import java.nio.charset.*;

public class md5 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        StringBuffer hexString = new StringBuffer();
        String og=sc.nextLine();
        byte[] encode;
        String hex;
        try{
                MessageDigest digest=MessageDigest.getInstance("MD5");
                digest.update(og.getBytes());
                encode=digest.digest();
        
       
        for (int i = 0; i < encode.length; i++) {
            hexString.append(Integer.toString((encode[i] & 0xff) + 0x100, 16).substring(1));
        }
    
    
        }
        catch(Exception e)
        {
            
        }
    
        
        System.out.println(hexString.toString());
    }
}