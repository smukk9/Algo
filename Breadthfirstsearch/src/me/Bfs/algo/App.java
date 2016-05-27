package me.Bfs.algo;

public class App {

	public static void main(String arg[]){

		Vertex v0 = new Vertex(1);
		Vertex v1 = new Vertex(2);
		Vertex v2 = new Vertex(3);
		Vertex v3 = new Vertex(4);
		Vertex v4 = new Vertex(5);
		Vertex v5 = new Vertex(6);
		

		v0.addToList(v1);
		v0.addToList(v2);
		v1.addToList(v3);
		v1.addToList(v4);
		v2.addToList(v5);
		
		BreadthFirstSearch bs = new BreadthFirstSearch();
		bs.bfs_algo(v0);
	}
}
