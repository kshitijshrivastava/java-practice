package comparableDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> stu= new ArrayList<Student>();
		
		stu.add(new Student("Chidvilas","Vayalpati",25));
		stu.add(new Student("Varun","Patil",29));
		stu.add(new Student("Kshitij","Shrivastava",31));
		Collections.sort(stu);
		
		for(Student itr: stu)
		{
			System.out.println(itr.firstName+" "+itr.lastName+" "+itr.age);
		}
		
//		System.out.println(s1.firstName);
//		System.out.println(s1.lastName);
//		System.out.println(s1.age);
		

	}

}
