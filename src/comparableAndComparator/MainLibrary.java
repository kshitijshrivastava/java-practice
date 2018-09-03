package comparableAndComparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import comparableDemo.AuthorNameComparator;
import comparableDemo.BookNameComparator;
import comparableDemo.InsertValues;

public class MainLibrary {

	public static void main(String[] args) {
		
		//List<Library> listLib = new LinkedList<Library>();
		//Set<Library> listLib = new TreeSet<Library>(new BookNameComparator());
		
		System.out.println("Enter the choice of your sorting\n"
				+ "1. For Sorting by Book Id\n"
				+ "2. For Sorting by Book Name\n"
				+ "3. For Sorting by Author Name");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {
		case 1: Set<Library> listLib = new TreeSet<Library>();
		System.out.println("Sorted by Book Id");
		InsertValues.insertData(listLib);
		InsertValues.printData(listLib);
		
			break;
		case 2: Set<Library> listLib1 = new TreeSet<Library>(new BookNameComparator());
		System.out.println("Sorted by Book Name");
		InsertValues.insertData(listLib1);
		InsertValues.printData(listLib1);
		break;
		case 3: Set<Library> listLib2 = new TreeSet<Library>(new AuthorNameComparator());
		System.out.println("Sorted by Author Name");
		InsertValues.insertData(listLib2);
		InsertValues.printData(listLib2);
		break;

		default: System.out.println("Incorrect choice, Program will Quit. Please try again with choices 1, 2 or 3 !!");
			System.exit(0);;
		}
		
		
		//Set<Library> listLib = new TreeSet<Library>(new AuthorNameComparator());
		//listLib.add(new Library("Astronomy","Hennings",02));
		//listLib.add(new Library("Biology","Kinley",03));
		//listLib.add(new Library("Civil","Arya",01));
		
		
        //System.out.println(listLib.get(0).toString());
		
	
        
        /*System.out.println("Printing the Arraylist without sorting");
        
        for(Library libItr: listLib)
        {
        	System.out.println("Book Author :"+libItr.getBookAuthor()+" Book Id :"+libItr.getBookId()+" Book Name: "+libItr.getBookName());
        }
        
        //Collections.sort(listLib);
        
        System.out.println("Printing after the Arraylist is sorted by book Id using ****COMPARABLE****");
        
        for(Library libItr: listLib)
        {
        	System.out.println("Book Author :"+libItr.getBookAuthor()+" Book Id :"+libItr.getBookId()+" Book Name: "+libItr.getBookName());
        }
        
        
System.out.println("Printing after the Arraylist is sorted by book Name using ****COMPARATOR****");
        
		//Collections.sort(listLib, new BookNameComparator());
        
        for(Library libItr: listLib)
        {
        	System.out.println("Book Author :"+libItr.getBookAuthor()+" Book Id :"+libItr.getBookId()+" Book Name: "+libItr.getBookName());
        }
        
        */
        
		
		//Using getters and setters and also overriding toString method
		/*Library lib1 = new Library("Java","Hennings",02);
		Library lib2 = new Library("C++","Kinley",03);
		Library lib3 = new Library("Maths","Arya",01);
		
		System.out.println(" ***Lib 1 values ***");
		System.out.println(lib1.getBookAuthor());
		System.out.println(lib1.getBookId());
		System.out.println(lib1.getBookName());
		
		System.out.println(" ***Lib 2 values ***");
		System.out.println(lib2.getBookAuthor());
		System.out.println(lib2.getBookId());
		System.out.println(lib2.getBookName());
		
		System.out.println(" ***Lib 3 values ***");
		System.out.println(lib3.getBookAuthor());
		System.out.println(lib3.getBookId());
		System.out.println(lib3.getBookName());
		
		System.out.println("Using set methods to set the values");
		lib1.setBookAuthor("Kshitij");
		lib1.setBookId(100);
		lib1.setBookName("Nautanki");
		
		System.out.println(" ***Lib 1 values after setting it using set methods ***");
		System.out.println(lib1.getBookAuthor());
		System.out.println(lib1.getBookId());
		System.out.println(lib1.getBookName());
		
		System.out.println("overriding toString method");
		System.out.println(lib1.toString());*/

	}

}
