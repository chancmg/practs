/**
 * Union and Find
 * Weighted Union with PathCompresion
 */
class weightedUnion{
    
    static int arr[];
    static int size[];
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
        size = new int[N];
        for(int i =0 ;i<N;i++)
        {
            arr[i]=i;
            size[i]=1;
        }

        printArr(arr);
        
        union(arr,size,4,3);
        union(arr,size,5,6);
        union(arr,size,1,2);
        printArr(arr);
        union(arr,size,5,2);
        printArr(arr);
		System.out.println(find(arr,1,5));
    }

  static  int getRoot(int arr[],int i){
        while(arr[i]!=i)
        {
            arr[i]=arr[arr[i]];
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

static void union(int arr[],int size[],int a,int b){
int root_a =getRoot(arr, a);
int root_b = getRoot(arr,b);
    if(size[root_a]<size[root_b])
    {
        arr[root_a]=arr[root_b];
        size[root_b]+=size[root_a];

    }
    else{
        arr[root_b]=arr[root_a];
        size[root_a]+=size[root_b];
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