package comparatorDemo;

import java.util.Comparator;

public class AgeComparator implements Comparator<Author> {


	@Override
	public int compare(Author a1,Author a2){
	   
	return a1.auAge > a2.auAge ? 1 : a1.auAge < a2.auAge ? -1 : 0;
	  }
	
}