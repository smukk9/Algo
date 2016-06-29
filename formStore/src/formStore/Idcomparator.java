package formStore;

import java.util.Comparator;

public class Idcomparator implements Comparator<formStore> {


	@Override
	public int compare(formStore o1, formStore o2) {
		// TODO Auto-generated method stub
		return o1.getId() > o2.getId() ? 1:(o1.getId()<o2.getId()?-1:0);	}


}
