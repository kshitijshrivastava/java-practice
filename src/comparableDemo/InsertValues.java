package comparableDemo;

import java.util.List;
import java.util.Set;

import comparableAndComparator.Library;

public class InsertValues {
	
	public static void insertData(Set<Library> listLib)
	{
		listLib.add(new Library("Astronomy","Hennings",02));
		listLib.add(new Library("Biology","Kinley",03));
		listLib.add(new Library("Civil","Arya",01));
	}
	
	public static void printData(Set<Library> listLib)
	{
		for(Library libItr: listLib)
        {
        	System.out.println("Book Author :"+libItr.getBookAuthor()+" Book Id :"+libItr.getBookId()+" Book Name: "+libItr.getBookName());
        }
	}

}
