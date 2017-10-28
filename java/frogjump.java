import java.util.*;
import java.io.*;

class frogjump
{
	private static int row,col;
	private static int [][] r=new int[251][251];
	private static int [][] d=new int[251][251];
	private int v;
	

	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		
		row=in.nextInt();
		col=in.nextInt();

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				r[row][col]=in.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				d[row][col]=in.nextInt();
			}
		}

		Graph graph=creategraph(row,col);
		int dest=row*col;
		ArrayList<Integer> shortpath =  doBFSShortestPath(graph, 0, dest-1);
		System.out.print(shortpath.size()-1);
		/*for(int node : shortpath)
		{
			System.out.print(node+" ");
		}
		System.out.print("]");*/
	
	}

	public static Graph creategraph(int r,int c)
	{	int v=r*c;

		int vertex[][]=new int[251][251];
		int count=0;
		 for(int i=0;i<r;i++)
 			{
  				for(int j=0;j<c;j++)
  				 {
   					 if(i==0 && j==0)
    					{
     						vertex[0][0]=count;
    						count+=1;
    					}
    				else
    					{
       						
       						vertex[i][j]=count;
       						count++;
   						}
   				}
  			}
		Graph g=new Graph(v);
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{	
				if(i==r-1 && j==c-1)
				{	
							//FOR LAST ITEM
					continue;
				}
				if(i==r-1)
				{
						
					g.addEdge(vertex[i][j],vertex[i][j+1]);
					g.addEdge(vertex[i][j+1],vertex[i][j]);		//FOR down END
					continue;
				}
				if(j==c-1)
				{
					
					g.addEdge(vertex[i][j],vertex[i+1][j]);
					g.addEdge(vertex[i+1][j],vertex[i][j]);
					continue;									//FOR right END
				}
				
				g.addEdge(vertex[i][j],vertex[i+1][j]);
				g.addEdge(vertex[i][j],vertex[i][j+1]);
				g.addEdge(vertex[i+1][j],vertex[i][j]);
				g.addEdge(vertex[i][j+1],vertex[i][j]);
				
			}
		}
		//g.printGraph();
		return g;

	}

		public static ArrayList<Integer> doBFSShortestPath(Graph graph, int source, int dest)
	{
		ArrayList<Integer> shortestPathList = new ArrayList<Integer>();
		HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();

		if (source == dest)
			return null;
		Queue<Integer> queue = new LinkedList<Integer>();
		Stack<Integer> pathStack = new Stack<Integer>();

		queue.add(source);
		pathStack.add(source);
		visited.put(source, true);

		while(!queue.isEmpty())
		{
			int u = queue.poll();
			ArrayList<Integer> adjList = graph.getOutEdges(u);

			for(int v : adjList)
			{
				if(!visited.containsKey(v))
				{
					queue.add(v);
					visited.put(v, true);
					pathStack.add(v);
					if(u == dest)
						break;
				}
			}
		}


		//To find the path
		int node, currentSrc=dest;
		shortestPathList.add(dest);
		while(!pathStack.isEmpty())
		{
			node = pathStack.pop();
			if(graph.isNeighbor(currentSrc, node))
			{
				shortestPathList.add(node);
				currentSrc = node;
				if(node == source)
					break;
			}
		}

		return shortestPathList;
	}

}

class Graph
{
	public static ArrayList<Integer>[] adjlist=null;

	public int noOfvertices;

	public Graph(int noOfVertices)
	{
		adjlist=(ArrayList<Integer>[])new ArrayList[noOfVertices+1];
		this.noOfvertices=noOfVertices;
		for(int i=0;i<(noOfvertices+1);i++)
			adjlist[i]=new ArrayList<Integer>();
	}

	public boolean isNeighbor(int u, int v)
	{
		if(adjlist[u]==null)
			return false;
		return adjlist[u].contains(v);
					
	}

	public void addEdge(int u, int v)
	{
		if(adjlist[u]==null)
			adjlist[u]=new ArrayList<Integer>();
		adjlist[u].add(v);
	}
	public int size()
	{
		return adjlist.length;
	}
	public ArrayList<Integer>[] getAdjacencyList()
	{
		return adjlist;
	}
	public void removeEdge(int u, int v)
	{
		int indexToBeRemoved=-1;
		ArrayList<Integer> edgeList=adjlist[u];
		for(int i=0;i<adjlist[u].size();i++)
		{
			int val=edgeList.get(i);
			if(val==v)
			{
				indexToBeRemoved=i;
			}
		}
		edgeList.remove(indexToBeRemoved);
	}
	public ArrayList<Integer> getOutEdges(int u)
	{
		return adjlist[u];
	}
	public void printGraph()
	{
		ArrayList<Integer> edgeList;
		for(int i=0;i<=noOfvertices;i++)
		{
			edgeList=adjlist[i];
			if(edgeList!=null)
			{
			for(int v : edgeList)
				System.out.println("u : "+i+" v : "+v);
			}
		}
	}
}
