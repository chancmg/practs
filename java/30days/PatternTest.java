import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



class PatternTest{
    public static void main(String args[])
    {
        Pattern ippattern = Pattern.compile("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
        String inIp=".213.123.23.32";
        Matcher ipmatch = ippattern.matcher(inIp);
        System.out.println(ipmatch.matches());
        Boolean valid = false;
        if(ipmatch.matches())
        {
            StringTokenizer tokens=new StringTokenizer(inIp, ".");
            while(tokens.hasMoreTokens())
            {
                int bit = Integer.parseInt(tokens.nextToken());
                if(bit < 255)
                {
                    valid=true;
                }
                else{
                    valid = false;
                    break;
                }
                
            }
        }
        System.out.println(valid);
}
}