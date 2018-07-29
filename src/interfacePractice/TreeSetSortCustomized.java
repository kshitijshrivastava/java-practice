package interfacePractice;

import java.util.Comparator;

public class TreeSetSortCustomized implements Comparator<Object>{

	@Override
	public int compare(Object arg0, Object arg1) {
		String s1 = (String) arg0;
		String s2 = (String) arg1;
		return s2.compareTo(s1);
		
	}

}
