class UnionFind{
  static  int arr[];
    public static void main(String args[])
    {
        long start = System.nanoTime();
        int N=10;
        arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=i;
        }
		
		printArr(arr);
        
        union(arr,N,4,3);
        union(arr,N,5,6);
        union(arr,N,1,2);
        printArr(arr);
        union(arr,N,5,2);
        printArr(arr);
        System.out.println(find(arr,1,5));
        
        System.out.println((System.nanoTime()-start));

    }
   static boolean find(int arr[],int a,int b)
   {
       if(arr[a]==arr[b])
        return true;
    
    return false;
   }

   static void union(int arr[],int n,int a,int b)
   {
       int t = arr[a];

       for(int i =0;i<n;i++)
       {
           if(arr[i]==t)
           {
               arr[i]=arr[b];
           }
       }
   }

  static void printArr(int arr[])
   {
	   for(int j=0;j<arr.length;j++)
	   {
		   System.out.print(arr[j]);
	   }
	   System.out.println("\n");
   }
}