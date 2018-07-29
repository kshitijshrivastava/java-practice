package typeCastingDemo;
import java.util.Scanner;

public class UnaryOperators {

	public static void main(String[] args) {
		/*int x = 10;
		int y = ++x; //11
		int z = x++; //11
		System.out.println(y);
		System.out.println(z);
		System.out.println(x);*/
		/*int i;
		for (i=1;i<5;i++);
		{
			System.out.println(i);
		}
		*/
		Scanner sc = new Scanner(System.in);
		String EmpName;
		double EmpId;
		char EmpGrade;
		System.out.println("Please enter Employee Name");
		//EmpName = sc.next();
		System.out.println("Please enter Employee Id");
		//EmpId = sc.nextDouble();
		System.out.println("Please enter Employee Grade");
		//EmpGrade = sc.next().charAt(0);
		System.out.println("Employee Name is: "+ sc.next());
		System.out.println("Employee id is: "+ sc.nextInt());
		System.out.println("Employee grade is: "+ sc.next().charAt(0));

	}

}
