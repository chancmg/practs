import java.util.*;
class convertToBase
{
public static void main(String args[])
{
System.out.print("Enter the decimal number : ");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.print("Enter the base you would like to convert the number to : ");
int b=sc.nextInt();
int q=n,r;
String ans="";
while(q!=0)
{
r=q%b;
ans=r+ans;
q=q/b;
}
System.out.println(ans);
}
}

