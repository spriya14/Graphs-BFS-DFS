package tests;


import org.junit.Before;
import org.junit.jupiter.api.Test;

import operations.Graph;

class TestGraphOp {
	
	private Graph g;
	
	

	@Test
	void test() {
		g = new Graph(8);
		
		g.addEdges(0, 1);
		g.addEdges(1, 0);
		g.addEdges(0, 3);
		g.addEdges(3, 0);
		g.addEdges(1, 4);
		g.addEdges(4, 1);
		g.addEdges(0, 6);
		g.addEdges(6, 0);
		g.addEdges(1, 5);
		g.addEdges(5, 1);
		g.addEdges(5, 2);
		g.addEdges(2, 5);
		g.addEdges(2, 7);
		g.addEdges(7, 2);
		g.addEdges(3, 5);
		g.addEdges(5, 3);
		g.addEdges(4, 6);
		g.addEdges(6, 4);
		
		
		g.BFS(0);
		
		
	
	}
	
	@Test
	void test_DFS() {
		g = new Graph(8);
		
		g.addEdges(0, 1);
		g.addEdges(1, 0);
		g.addEdges(0, 3); 
		g.addEdges(3, 0);
		g.addEdges(1, 4);
		g.addEdges(4, 1);
		g.addEdges(0, 6);
		g.addEdges(6, 0);
		g.addEdges(1, 5);
		g.addEdges(5, 1);
		g.addEdges(5, 2);
		g.addEdges(2, 5);
		g.addEdges(2, 7);
		g.addEdges(7, 2);
		g.addEdges(3, 5);
		g.addEdges(5, 3);
		g.addEdges(4, 6);
		g.addEdges(6, 4);
		
		
		g.DFS(0);
		
		
	
	}
	
	
	@Test
	void test_Directed_DFS() {
		g = new Graph(8);
		
		g.addEdges(0, 1);
		g.addEdges(1, 2);
		g.addEdges(2, 3);
		g.addEdges(3, 4);
		//g.addEdges(2, 9);
		g.addEdges(1, 6);
		g.addEdges(6, 7);
		g.addEdges(7, 0);
		
		
		
		g.DFS(0);
		
		
	
	}

}
