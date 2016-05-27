package com.sandeep.app;
import com.sandeep.node.Node;
import com.sandeep.utils.utilities;
public class mainaapp {

	public static void main(String args[]){

		//intializing the root node.
		Node root= new Node();
		root.setData(null);
		//as char can not be null so this would be good alternative
		root.setLables('\0');
		root.setComplete(false);
		utilities utils = new utilities();

		//test words and data.
		String [] test_words = { "app","apple","java","jam","appricot","box","bond"};
		String[] data_words ={"d1","d2","d3","d4","d5","d6","d7"};

		for(int i=0; i< test_words.length; i++){

			boolean result = utils.insert(test_words[i], data_words[i], root);

			if(result){
				System.out.println("Sucess inserted:"+ test_words[i]);
			} else {
				System.out.println("Failed to insert word: " + test_words[i]);
			}

		}

		utils.print_Nodes(root);
	}


}
