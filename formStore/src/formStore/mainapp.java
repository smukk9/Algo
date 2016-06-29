package formStore;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class mainapp {

	public static void print_all ( List<formStore> a){
		System.out.println("S.NO"+"\t"+"Control"+"\t"+"required"+"\t"+"prority");
		for(formStore b: a){
			System.out.print(b.getId()+"\t" );
			System.out.print(b.getDatatype()+"\t  " );
			System.out.print(b.getRequired()+"\t" );
			System.out.print(b.getPriority()+"\n" );
		}
		System.out.println("\n*****************************************");
	}

	public static void main(String arg[]){

		List<formStore> list_forms = new LinkedList	<formStore>();

		formStore obj1 = new formStore(1,"text",true,7);
		list_forms.add(obj1);

		formStore obj2 = new formStore(2,"text",false,7);

		list_forms.add(obj2);

		formStore obj3= new formStore(3,"text",false,7);

		list_forms.add(obj3);

		formStore obj4 = new formStore(4,"date",true,5);

		list_forms.add(obj4);

		formStore obj5 = new formStore(5,"date",true,5);

		list_forms.add(obj5);

		formStore obj6 = new formStore(6,"progress",false,6);

		list_forms.add(obj6);

		//System.out.println(obj6.getDatatype()+" "+ obj6.getId());

		formStore obj7 = new formStore(7,"contact",false,2);

		list_forms.add(obj7);

		formStore obj8 = new formStore(8,"progress",false,6);
		list_forms.add(obj8);

		System.out.println("Orginal Control List");
		print_all(list_forms);

		//*********************************************************



		//final array that contains the 5 picked elements of the table and have the sorted order.
		List<formStore> final_list = new ArrayList<>();
		
		//temp list used to store the controls on the final_list
		List<formStore> temp_list = new ArrayList<>();
		int pick_count = 0;
		List<formStore> true_Store = new ArrayList<>();
		List<formStore> false_Store = new ArrayList<>();

		//aggregate all the true values and false values in a two different list.
		for(formStore a: list_forms){
			if(a.isRequired()){
				true_Store.add(a);
			}
			if(!a.isRequired()){
				false_Store.add(a);
			}
		}

		//sorting on the basis of priority
		Collections.sort(false_Store, new prorityComparator());	
		Collections.sort(true_Store, new prorityComparator());
		System.out.println("false Store");
		print_all(false_Store);
		System.out.println("true Store");
		print_all(true_Store);
		
		
		// picking controls true store
		while(final_list.size() != true_Store.size()){
			for(formStore x :true_Store){
				if(!temp_list.contains(x)&& !x.isVisted() && pick_count <5){
					x.setVisted(true);
					temp_list.add(x);
					pick_count++;
				}
			}
			final_list.addAll(temp_list);
			temp_list.clear();
		}
		

		///picking controls false Store
		while(pick_count <5){
			for(formStore x :false_Store){
				if( !temp_list.contains(x)&& !x.isVisted() && pick_count <5){
					x.setVisted(true);
					temp_list.add(x);
					pick_count++;
				}
			}
			final_list.addAll(temp_list);
			temp_list.clear();
		}

		//sorting the values on the ID
		Collections.sort(final_list, new Idcomparator());

		System.out.println("final picked elements");
		print_all(final_list);
	}}


