import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.security.*;
import java.nio.charset.*;

public class sha256 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        StringBuffer hexString = new StringBuffer();
        String og=sc.nextLine();
        byte[] encode;
        String hex;
        try{
                MessageDigest digest=MessageDigest.getInstance("SHA-256");
        encode=digest.digest(og.getBytes(StandardCharsets.UTF_8));
        
          for (int i = 0; i < encode.length; i++) {
                 hex= Integer.toHexString(0xff & encode[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
    }
        }
        catch(Exception e)
        {
            
        }
    
        
        System.out.println(hexString.toString());
    }
}