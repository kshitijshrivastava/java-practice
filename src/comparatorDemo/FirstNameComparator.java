package comparatorDemo;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<Author> {

	@Override
	public int compare(Author a1, Author a2) {
		// TODO Auto-generated method stub
		return a1.firstName.compareTo(a2.firstName);
	}

	
}
