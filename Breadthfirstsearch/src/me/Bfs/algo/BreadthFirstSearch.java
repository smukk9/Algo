package me.Bfs.algo;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	
	
	
	public void bfs_algo(Vertex root){
		
		Queue<Vertex> queue = new LinkedList<Vertex>();
	
		root.setVisted(true);
		queue.add(root);
		 while(!queue.isEmpty()){
			 
			 Vertex temp = queue.remove();
			 System.out.print(temp.getData()+"-");
			 
			 for(Vertex v : temp.getAdjacent_List()){
				 
				 if(!v.isVisted()){
					 v.setVisted(true);
					 queue.add(v);
					 
				 }
			 }
			 
		 }
		 }
	
}
