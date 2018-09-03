package comparableDemo;

import java.util.Comparator;

import comparableAndComparator.Library;

public class AuthorNameComparator implements Comparator<Library>{

	@Override
	public int compare(Library lib1, Library lib2) {
		// TODO Auto-generated method stub
		return lib1.getBookAuthor().compareTo(lib2.getBookAuthor());
	}

}
