package me.Bfs.algo;
import java.util.ArrayList;
import java.util.List;

public class Vertex {
	

	
	private int data;
	private boolean visted;
	
	public boolean isVisted() {
		return visted;
	}
	public void setVisted(boolean visted) {
		this.visted = visted;
	}
	public List<Vertex> getAdjacent_List() {
		return adjacent_List;
	}
	private List<Vertex> adjacent_List;
	
	public Vertex(int data){
		this.data = data;
		this.adjacent_List=new ArrayList<Vertex>();
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	
	public void addToList(Vertex vertex){
		
		adjacent_List.add(vertex);
}
}
