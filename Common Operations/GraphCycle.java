//check if a given graph has cycle
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GraphCycle {
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	      static String next () throws IOException {
	    	 while (st == null || !st.hasMoreTokens())
	    	 st = new StringTokenizer(br.readLine().trim());
	    	 return st.nextToken();
	      }
		  static int readInt () throws IOException {
		    return Integer.parseInt(next());
		  }
		  
	static int n;
	static int[] vis; //mark if visited
	//for [x][y], if x connects to y, adjacent (1), then true; if not adjacent (0), false
	static boolean[][] adj; 
	static boolean cycle; //is there a cycle
	
	public static void main(String[] args) throws IOException{
		n = readInt(); //number of rows and columns of the adjacency array graph
		adj = new boolean[n][n];
		vis = new int[n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				adj[i][j] = (readInt() == 1 ? true : false);
			}
		}
		
		for (int i = 0; i < n; i++) {
			if (vis[i] == 0) { //if haven't visited the node
				dfs(i); //recursively explore where this vertex leads to
			}
		}
		System.out.println(cycle ? "YES" : "NO");		
    } 
	
	static void dfs(int u) {
		vis[u] = 1; //marked visited, in stack
		for (int v = 0;  v < n; v++) {
			if (adj[u][v]) { //if u connect to v
				if (vis[v] == 1) { 
					//if the adjacent node has been explored and is in stack
					cycle = true; return;
				}else if (vis[v] == 0) { 
					//if the adjacent node hasn't been explored, recursively explore it
					dfs(v);
				}
			}
		}
		vis[u] = 2; //vertex u has been completely explored
	}
}
