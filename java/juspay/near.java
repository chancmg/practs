import java.util.*;
class maxentry
{
public static void main(String [] args) throws Exception
{
	
    int j;
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    int nearval;
    int init,s;
 
    for(int i=0;i<n;i++)
    {
        a[i]=in.nextInt();
    }

    int c1=in.nextInt();
    int c2=in.nextInt();

    if(c1==c2)
    {
        nearval=c1;
    }
    else if(c1<n && c2<n)
    {
       if(c1<c2)
       {
        init=c1;
        s=c2;
       }
       else
       {

        init=c2;
        s=c1;
       }
while(true){

    int temp=a[init];

    


}

       
}


    }
    

    System.out.println(nearval);
}
}