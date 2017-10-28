import java.text.SimpleDateFormat;
import java.io.*;
import java.util.Date;
class dateprint{
  public static void main(String args[])
  {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm aa");
    String format = simpleDateFormat.format(new Date());
    
    System.out.println(format);
  }
}