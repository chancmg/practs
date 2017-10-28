class multi
{
  public static void main(String args[])
  {
 int r=3;
  int c=4;
  int vertex[][]=new int[100][100];
  int count=0;
  for(int i=0;i<r;i++)
  {
   for(int j=0;j<c;j++)
   {
    if(i==0 && j==0)
    {
      System.out.println("Executed");
     vertex[0][0]=count;
     count+=1;
    }
    else
    {
       System.out.println(i+","+j);
       vertex[i][j]=count;
       count++;
   }
   }
  }
  
  System.out.println(vertex[0][3]);
}
}