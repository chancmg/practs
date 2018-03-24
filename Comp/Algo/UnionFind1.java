class UnionFind1{
    static int arr[];
    public static void main(String args[])
    {
        long start = System.nanoTime();
        int n=10;
        solver(n);
        System.out.println((System.nanoTime()-start));
    }
  static void solver(int N)
    {
        arr = new int[N];
        for(int i =0 ;i<N;i++)
        {
            arr[i]=i;
        }

        printArr(arr);
        
        union(arr,4,3);
        union(arr,5,6);
        union(arr,1,2);
        printArr(arr);
        union(arr,5,2);
        printArr(arr);
		System.out.println(find(arr,1,5));
    }

  static  int getRoot(int arr[],int i){
        while(arr[i]!=i)
        {
            i= arr[i];
        }
        return i;
    }

    static boolean find(int arr[],int a,int b)
    {
        if(getRoot(arr, a)==getRoot(arr, b))
            return true;
        return false;
    }

    static  void union(int arr[],int a,int b)
    {
        arr[getRoot(arr, a)] = getRoot(arr, b);
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