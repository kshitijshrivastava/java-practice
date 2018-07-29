package exceptionHandlingDemo;

public class PropogationDemo {

	public static void main(String[] args) {
    System.out.println("main method started");
    m1();
    System.out.println("main method ended");
	}
	
	public static void m1()
	{
		System.out.println("m1 method started");
		m2();
		
		System.out.println("m1 method ended");
		//throw new ArrayIndexOutOfBoundsException();
	}
	public static void m2()
	{
		System.out.println("m2 method started");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	
		System.out.println("m2 method ended");
	}

}
