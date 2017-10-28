import java.io.*;
import java.util.*;

class prime {
  static BufferedReader br;
  static PrintWriter out;
  static StringTokenizer st;


  public static void main (String[] args) throws IOException {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(new OutputStreamWriter(System.out));
    // br = new BufferedReader(new FileReader("in.txt"));
    // out = new PrintWriter(new FileWriter("out.txt"));
    int T=readInt();
    int s,e;
    for(int i=0;i<T;i++)
    {
      s=readInt();
      e=readInt();
      for(int loop=s; loop<=e; loop++)
      {
          if(isPrime(loop)==true)
              System.out.println(loop);
      }
    }

    out.close();
  }

  static boolean isPrime(int num)
    {
        boolean flag=true;
        for(int i=2; i<=(num/2);i++)
        {
            if(num%i==0)
            {
                flag=false;
                break;
            }
        }
        return flag;
    }

  static String next () throws IOException {
    while (st == null || !st.hasMoreTokens())
      st = new StringTokenizer(br.readLine().trim());
    return st.nextToken();
  }

  static long readLong () throws IOException {
    return Long.parseLong(next());
  }

  static int readInt () throws IOException {
    return Integer.parseInt(next());
  }

  static double readDouble () throws IOException {
    return Double.parseDouble(next());
  }

  static char readCharacter () throws IOException {
    return next().charAt(0);
  }

  static String readLine () throws IOException {
    return br.readLine().trim();
  }


}
