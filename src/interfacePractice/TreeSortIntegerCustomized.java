package interfacePractice;

import java.util.Comparator;

public class TreeSortIntegerCustomized implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		int i1 = o1;
		int i2 = o2;
		if (i2>i1)
			return 1;
		else if (i1>i2)
			return -1;
		else
			return 0;
		
		
	}

	

}
