package comparableDemo;

public class Student implements Comparable<Student>{
	
	public String firstName;
	public String lastName;
	public int age;
	
	public Student(String firstName,String lastName, int age )
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
	}
	
	
	//to sort by last name
	@Override
	/*public int compareTo(Student student) {
		// TODO Auto-generated method stub
		return this.lastName.compareTo(student.lastName);
	}*/
	
	//to sort by first name
	/*public int compareTo(Student student) {
		// TODO Auto-generated method stub
		return this.firstName.compareTo(student.firstName);
	}*/
	
	//to sort by age
	public int compareTo(Student student)
	{
	/*	if (this.age==student.age)
		{
			return 0;
		}
		else if(this.age>student.age)
		{
			return 1;
		}
		else
			return -1;*/
		
		return this.age > student.age ? 1 : this.age < student.age ? -1 : 0;
	}
	
	

}
