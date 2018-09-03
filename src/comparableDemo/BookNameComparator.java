package comparableDemo;

import java.util.Comparator;

import comparableAndComparator.Library;

public class BookNameComparator implements Comparator<Library>{

	@Override
	public int compare(Library lib1, Library lib2) {
		// TODO Auto-generated method stub
		return lib1.getBookName().compareTo(lib2.getBookName());
	}

}
