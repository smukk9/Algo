package formStore;

import java.util.Comparator;

public class prorityComparator implements Comparator<formStore> {

	@Override
	public int compare(formStore fit1, formStore fit2){
		
		 if (fit2.getPriority()>fit1.getPriority())
	            return 1;
	    else if (fit2.getPriority()<fit1.getPriority())
	            return -1;
	    else
	            return  0;
}
}