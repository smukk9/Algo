package com.sandeep.node;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 */
public class Node {

	private char lables;
	private List<Node> links=new ArrayList<Node>();
	private String data;


	//denotes the end of the word that is given. 
	private boolean complete;

	public Node(){

	}

	public Node(char lables, String data, boolean complete){

		this.lables = lables;
		this.data = data;
		this.complete = complete;

	}

	public char getLables() {
		return lables;
	}

	public void setLables(char lables) {
		this.lables = lables;
	}

	public List<Node> getLinks() {
		return links;
	}

	public void setLinks(List<Node> links) {
		this.links = links;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}





	public Node Return_childNode(char str){

		if(this.getLinks()!=null){

			for(Node child : this.getLinks()){

				if(child.getLables() ==str){

					return child;
				}
			}
		}
		return null;
	}
}

