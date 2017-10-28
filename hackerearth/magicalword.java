import java.util.*;
import java.io.*;

class InputReader {

	private InputStream stream;
	private byte[] buf = new byte[1024];
	private int curChar;
	private int numChars;
	private SpaceCharFilter filter;

	public InputReader(InputStream stream) {
		this.stream = stream;
	}

	public int read() {
		if (numChars == -1)
			throw new InputMismatchException();
		if (curChar >= numChars) {
			curChar = 0;
			try {
				numChars = stream.read(buf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (numChars <= 0)
				return -1;
		}
		return buf[curChar++];
	}

	public int readInt() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		int sgn = 1;
		if (c == '-') {
			sgn = -1;
			c = read();
		}
		int res = 0;
		do {
			if (c < '0' || c > '9')
				throw new InputMismatchException();
			res *= 10;
			res += c - '0';
			c = read();
		} while (!isSpaceChar(c));
		return res * sgn;
	}

	public String readString() {
		int c = read();
		while (isSpaceChar(c))
			c = read();
		StringBuilder res = new StringBuilder();
		do {
			res.appendCodePoint(c);
			c = read();
		} while (!isSpaceChar(c));
		return res.toString();
	}

	public boolean isSpaceChar(int c) {
		if (filter != null)
			return filter.isSpaceChar(c);
		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
	}

	public String next() {
		return readString();
	}

	public interface SpaceCharFilter {
		public boolean isSpaceChar(int ch);
	}
}

class OutputWriter {
	private final PrintWriter writer;

	public OutputWriter(OutputStream outputStream) {
		writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
	}

	public OutputWriter(Writer writer) {
		this.writer = new PrintWriter(writer);
	}

	public void print(Object...objects) {
		for (int i = 0; i < objects.length; i++) {
			if (i != 0)
				writer.print(' ');
			writer.print(objects[i]);
		}
	}

	public void printLine(Object...objects) {
		print(objects);
		writer.println();
	}

	public void close() {
		writer.close();
	}

	public void flush() {
		writer.flush();
	}

}

class IOUtils {

	public static int[] readIntArray(InputReader in, int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++)
			array[i] = in.readInt();
		return array;
	}

}

class magicalword{

	public static void main(String args[]) throws IOException
	{
		StringBuilder instr=new StringBuilder();
		InputReader in = new InputReader(System.in);
		OutputWriter out= new OutputWriter(System.out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=in.readInt();
		for(int i=0;i<t;i++)
		{
			int n=in.readInt();
			char c;
			String org;
			int diff1=0,diff2=0;
			int num1=0,num2=0;
			int asc,pasc;
			for(int j=0;j<n;j++)
			{
				c=(char) br.read();
				asc=c;
				for(int k=asc;;k++)
				{
					if(isPrime(k))
					{
						diff1=k-asc;
						num1=k;
						break;
					}
				}
				for(int k=asc;;k--)
				{
					if(isPrime(k))
					{
						diff2=asc-k;
						num2=k;
						break;
					}
				}
				if(diff1<diff2)
					pasc=num1;
				else if(diff2<diff1)
					pasc=num2;
				else
					if(num1<num2)
						pasc=num1;
					else
						pasc=num2;

					instr.append(Character.toString((char)pasc));
				}


				out.printLine(instr.toString());

			}


			out.flush();
			out.close();
		}

		public static boolean isPrime(int n)//Function to check if a number is Prime.
		{
			int c=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
					c++;
			}
        if(c==2)//Prime no.has 2 factors-1 and number itself.
        return true;
        else
        	return false;
    }


}