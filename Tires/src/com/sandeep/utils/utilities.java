package com.sandeep.utils;

import com.sandeep.node.Node;

public class utilities {

	/*
	 * Insert Logic:
	 * 		
	 * Insert works on two Functions one "search_ifExists" which checks if the given String is already exisiting.
	 * Second one "Return_childnode" which will return the child node if the label in string matches with the anyod the child nodes that 
	 * exists is the list(child Nodes list)
	 * 
	 * ******** Correction **********
	 * 
	 * 	Hashtable idea that i sugested during the interview is really not suitable and not the right approach. it is much eaier if we could
	 * just put all the childs of the node in a list. As the Node class has a list in them it allows
	 * an easy way of traversing along the word. 
	 * 
	 */

	public boolean insert(String key, String data, Node root){


		//checks if the key already exists.
		if(search_ifExists(key, root)){

			return true;
		}
		//breaks down the gicen key in to single chars.
		char [] all_lables = key.toCharArray();
		Node current_node = root;

		//loops through each label by checking if it exists in the tree or else inserting 
		//inserting in to the tree.
		for(char label: all_lables){

			//Returns the child node who's char matches with the lable.
			Node child = current_node.Return_childNode(label);

			//if child exists then walks on to the returned node in the tree
			if(child!=null){

				current_node = child;
			}else{
				//child din't exist, than create a new node and add to the current node.
				Node temp = new Node(label,null,false);
				current_node.getLinks().add(temp);
				current_node = current_node.Return_childNode(label);
			}
		}
		//finally, marks the end node that completes the given key.
		current_node.setComplete(true);
		current_node.setData(data);
		return true;
	}

	/*
	 * 
	 * search if it exisit already in the tree.
	 */
	public boolean search_ifExists(String word, Node root){

		Node current = root;
		for(char ch : word.toCharArray()){
			if(current.Return_childNode(ch)==null){
				return false;
			}else{
				current = current.Return_childNode(ch);
			}
		}		
		if(current.isComplete()){
			return true;
		}
		return false;
	}




	/*
	 * prints root node of the tree recursivly from root node to it's leafs
	 * 
	 */
	public void print_Nodes(Node root) {

		if(root.getData()!="null"){

			System.out.println(root.getLables());
			if(root.getData()!=null){
				System.out.println("->"+root.getData());
			}
		}
		for(Node v : root.getLinks()){

			print_Nodes(v);
		}



	}
}

