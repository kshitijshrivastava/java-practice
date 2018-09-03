package comparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class AuthorComparatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			List<Author> al= new ArrayList<Author>();
			
			
			//al.add
			
			
			
			
			al.add(new Author("Chidvilas","C++",35));
			al.add(new Author("Varun","Visual Basic",29));
			al.add(new Author("Kshitij","Java",31));
			Collections.sort(al, new AgeComparator());
			System.out.println("Sort by Age");
			for(Author au: al)
			{
				System.out.println(au.firstName+" "+au.bookName+" "+au.auAge);
			}
			Collections.sort(al, new FirstNameComparator());
			
			System.out.println("Sort by First Name");
			for(Author au: al)
			{
				System.out.println(au.firstName+" "+au.bookName+" "+au.auAge);
			}

	}

}
