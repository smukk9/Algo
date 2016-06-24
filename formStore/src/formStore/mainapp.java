	package formStore;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.ListIterator;

	public class mainapp {
		
		public static void print_all ( List<formStore> a){
				System.out.println(a.size());
			for(formStore b: a){
				
				System.out.print(b.getId()+"\t" );
				System.out.print(b.getDatatype()+"      " );
				System.out.print(b.getRequired()+"\n" );
			}
			System.out.println("\n*****************************************");
		}
		
		public static void main(String arg[]){
			
			List<formStore> list_forms = new LinkedList	<formStore>();
			 
			formStore obj1 = new formStore(1,"text",true,1);
			list_forms.add(obj1);
			
			formStore obj2 = new formStore(2,"text",false,1);
		
			list_forms.add(obj2);
			
			formStore obj3= new formStore(3,"text",false,1);
			
			list_forms.add(obj3);
			
			formStore obj4 = new formStore(4,"date",false,2);
			
			list_forms.add(obj4);
			
			formStore obj5 = new formStore(5,"date",false,2);
			
			list_forms.add(obj5);
			
			formStore obj6 = new formStore(6,"progress",false,3);
			
			list_forms.add(obj6);
			
			//System.out.println(obj6.getDatatype()+" "+ obj6.getId());
			
			formStore obj7 = new formStore(7,"contact",false,4);
			
			list_forms.add(obj7);
			
			formStore obj8 = new formStore(8,"progress",true,3);
			list_forms.add(obj8);
		
					
			print_all(list_forms);
			
			//*********************************************************
			
		
		
			//final array that contains the 5 picked elements of the table and have the sorted order.
			List<formStore> final_list = new ArrayList<>();
			int pick_count = 0;
			for(formStore item : list_forms ){
				if(item.isRequired() && !final_list.contains(item) && pick_count<5 )
				{	
					item.setVisted(true);
					final_list.add(item);
					pick_count++;
				}
			}
			
			
			
			
			 
			 
			
			
		}}
			
			
			