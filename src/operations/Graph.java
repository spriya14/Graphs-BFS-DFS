package operations;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
	
	//Setting up the graph
	
	public int V; // number of vertices
	public LinkedList<Integer> adj[]; //empty array which stores the linked list.
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Graph(int v){
		V = v;
		adj= new LinkedList[v];
		for(int i =0; i<v ; i++) {
			adj[i] = new LinkedList();
		}
	}
		
		public void addEdges(int v, int w) {
			adj[v].add(w);
		}
		
		//Actual Traversal of the Tree.
		public void BFS(int s) {
			
			//mark all vertices as not visited.
			boolean visited[] = new boolean[V];
			
			//create a queue for BFS.
			LinkedList<Integer> queue = new LinkedList<Integer>();
			
			//Mark the current node as visited and enqueue it.
			visited[s] = true;
			System.out.println("Starting at " +s);
			queue.add(s);
			
			while (queue.size() != 0) {
				
				s = queue.poll();
				System.out.println("Dequeuing at " +s);
				
				Iterator<Integer> i = adj[s].listIterator();
				while (i.hasNext()) {
					int n = i.next();
					if (!visited[n]) {
						visited[n] = true;
						System.out.println("Q'ing at "+n);
						queue.add(n);
					}
				}
				
			}
			
			}
		
		
		   public void DFS(int v)
		    {
		        boolean visited[] = new boolean[V];

		        Stack<Integer> stack = new Stack<Integer>();
		        stack.add(v);

		        visited[v] = true;

		        while (!stack.isEmpty()) {
		            int current = stack.pop();
		            System.out.print(current + " ");

		            Iterator<Integer> i = adj[current].listIterator();
		            while (i.hasNext())
		            {
		                int n = i.next();
		                if (!visited[n]) {
		                    stack.add(n);
		                    visited[n] = true;
		                }
		            }
		        }
		    }
			
		}
		
		
	
	


