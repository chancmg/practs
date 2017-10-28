import java.io.*;


class TestClass
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		String input=in.readLine();
		StringBuilder sb=new StringBuilder(input);
		for(int i=0;i<sb.length();i++)
		{
			char c=sb.charAt(i);
			if(Character.isLowerCase(c))
			{
				sb.setCharAt(i,Character.toUpperCase(c));
			}
			else
			{
				sb.setCharAt(i,Character.toLowerCase(c));
			}
		}
		out.print(sb.toString());
		out.flush();
		out.close();
	}
}