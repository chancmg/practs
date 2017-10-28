import java.math.BigInteger;
import java.io.*;
import java.util.*;;

class fact2 {

   public static void main(String[] args) {
   		MyScanner in = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out), true);
 
		int t=in.nextInt();
		int n[]=new int[t];
 
		for(int i=0;i<t;i++)
		{
			n[i]=in.nextInt();
 
		}
		for (int j:n)
		{
			String fact = factorial(j);
       		out.println(fact);
		}
		
		out.close();
       
   }

   public static String factorial(int n) {
       BigInteger fact = new BigInteger("1");
       for (int i = 1; i <= n; i++) {
           fact = fact.multiply(new BigInteger(i + ""));
       }
       return fact.toString();
   }


    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
 
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
         
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}