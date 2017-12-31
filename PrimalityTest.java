import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class PrimalityTest {
	static BufferedReader br;
	static PrintWriter out;
	static StringTokenizer st;

	public static void main(String[] args)throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);

		String in = next();
		BigInteger bigPrime = new BigInteger(in);

		String output = bigPrime.isProbablePrime(1) ? "prime" : "not prime";
		out.println(output);

		out.close();
	}

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong() throws IOException {
		return Long.parseLong(next());
	}

	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}

	static char readCharacter() throws IOException {
		return next().charAt(0);
	}

	static String readLine() throws IOException {
		return br.readLine().trim();
	}
}
